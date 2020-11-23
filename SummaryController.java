package hu.uni.eku.team3.controller;

import hu.uni.eku.team3.controller.dto.SummaryDto;
import hu.uni.eku.team3.controller.dto.SummaryRecordRequestDto;
import hu.uni.eku.team3.model.Summary;
import hu.uni.eku.team3.service.SummaryService;
import hu.uni.eku.team3.service.exceptions.SummaryAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.SummaryNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Summary")
@RequiredArgsConstructor
@Api(tags = "Summary")
@Slf4j
public class SummaryController {

    private final SummaryService summaryService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch summary")
    public Collection<SummaryDto> fetchAll() {
        return SummaryService.fetchAll().stream().map(summary ->
                SummaryDto.builder()
                        .summaryID(summary.getsummaryID())
                        .identityNumber(summary.getidentityNumber())
                        .servicesID(summary.getservicesID())
                        .barCode(summary.getbarCode())
                        .build()
        ).collect(Collectors.toList());
    }

    @PostMapping(value = {"/create"})
    @ApiOperation(value = "Create new summary")
    public void create(@RequestBody SummaryRecordRequestDto request) {
        try{
            SummaryService.create(new Summary(request.getsummaryID(), request.getidentityNumber(), request.getservicesID(), request.getbarCode()));
        }
        catch (SummaryAlreadyExistsException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }


    @DeleteMapping(value = {"/{summaryID}"})
    @ApiOperation(value = "Delete summary")
    public void delete(@PathVariable Integer summaryID) {
        try{
            SummaryService.delete(summaryID);
        }
        catch (SummaryNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    }

