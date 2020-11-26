package hu.uni.eku.team3.controller;

import hu.uni.eku.team3.controller.dto.GuestDto;
import hu.uni.eku.team3.controller.dto.GuestRecordRequestDto;
import hu.uni.eku.team3.model.Guest;
import hu.uni.eku.team3.service.GuestService;
import hu.uni.eku.team3.service.exceptions.GuestAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.GuestNotFoundException;
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
@RequestMapping(value = "/Guest")
@RequiredArgsConstructor
@Api(tags = "Guest")
@Slf4j
public class GuestController {

    private final GuestService guestService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch guest")
    public Collection<GuestDto> fetchAll() {
        return GuestService.fetchAll().stream().map(guest ->
                GuestDto.builder()
                        .identityNumber(guest.getidentityNumber())
                        .name(guest.getUserId())
                        .dateOfBirth(guest.getdateOfBirth())
                        .arrivalDate(guest.getarrivalDate())
                        .departureDate(guest.getdepartureDate())
                        .build()
        ).collect(Collectors.toList());
    }
    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value= "Query  Guest")
    public Collection<GuestDto> query() {
        return service.readAll().stream().map(model ->
                GuestDto.builder()
                        .identityNumber(model.getidentityNumber())
                        .name(model.getname())
                        .dateOfBirth(model.getdateOfBirth())
                        .arrivalDate(model.getarrivalDate())
                        .departureDate(model.getdepartureDate())
                        .build()
        ).collect(Collectors.toList());
    }

    @PutMapping(value = {"/{identityNumber}"})
    @ApiOperation(value = "Update a guest")
    public void update(@PathVariable Integer identityNumber, @RequestBody GuestRecordRequestDto request) {
        try {
            GuestService.update(identityNumber, new Guest(request.getidentityNumber(), request.getname(), request.getdateOfBirth(), request.getarrivalDate(),request.getdepartureDate()));
        }
        catch(GuestNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping(value = {"/{identityNumber}"})
    @ApiOperation(value = "Delete guest")
    public void delete(@PathVariable Integer identityNumber) {
        try{
                GuestService.delete(identityNumber);
            }
        catch (GuestNotFoundException e) {
                throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
            }
        }

    }

