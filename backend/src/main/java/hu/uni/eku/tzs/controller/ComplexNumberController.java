package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.ComplexNumberDto;
import hu.uni.eku.tzs.model.ComplexNumber;
import hu.uni.eku.tzs.service.ComplexNumberService;
import hu.uni.eku.tzs.service.exceptions.ComplexNumberAlreadyExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/complex-number")
@RequiredArgsConstructor
@Api(tags = "Complex Numbers")
@Slf4j
public class ComplexNumberController {

    private final ComplexNumberService service;

    @GetMapping("/record")
    @ApiOperation(value = "Record")
    public void record(
            @ApiParam(name = "real", required =  true, defaultValue = "0", example = "0")
            @RequestParam(name = "real")
            double real,
            @ApiParam(name = "imag",  required = true, defaultValue = "0", example = "0")
            @RequestParam(name = "imag")
            double imaginary
    ){
        log.info("Recording of Complex Number ({},{})",real,imaginary);
        try {
            service.record(new ComplexNumber(real,imaginary));
        } catch (ComplexNumberAlreadyExistsException e) {
            log.info("Complex number ({},{}) is already exists!", real,imaginary);
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        }
    }

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value= "Query Complex Numbers")
    public Collection<ComplexNumberDto> query(){
        return service.readAll().stream().map(model ->
                ComplexNumberDto.builder()
                .real(model.getReal())
                .imaginary(model.getImaginary())
                .build()
        ).collect(Collectors.toList());
    }

}
