package hu.uni.eku.team3.controller;

import hu.uni.eku.team3.controller.dto.ServiceDto;
import hu.uni.eku.team3.controller.dto.ServiceRecordRequestDto;
import hu.uni.eku.team3.model.Service;
import hu.uni.eku.team3.service.ServiceService;
import hu.uni.eku.team3.service.exceptions.ServiceAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.ServiceNotFoundException;
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
@RequestMapping(value = "/service")
@RequiredArgsConstructor
@Api(tags = "Services")
@Slf4j
public class ServiceController {

    private final ServiceService service;

    @PostMapping("/record")
    @ApiOperation(value = "Record")
    public void record(
            @RequestBody
                    ServiceRecordRequestDto request
    ) {
        log.info("Recording of Service ({},{})", request.getName(), request.getPrice());
        try {
            service.create(new hu.uni.eku.team3.model.Service(0, request.getName(), request.getPrice()));
        } catch (ServiceAlreadyExistsException e) {
            log.info("Service ({},{}) is already exists! Message: {}", request.getName(), request.getPrice(),
                    e.getMessage());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        }
    }

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Query Services")
    public Collection<ServiceDto> query() {
        return service.readAll().stream().map(model ->
                ServiceDto.builder()
                        .id(model.getId())
                        .name(model.getName())
                        .price(model.getPrice())
                        .build()
        ).collect(Collectors.toList());
    }

    @PutMapping("/update/{id}")
    @ApiOperation(value = "Update")
    public void update(@PathVariable Integer id, @RequestBody
            ServiceRecordRequestDto request) {
        log.info("Updating Service {}", id);
        try {
            service.update(id, new Service(request.getId(), request.getName(), request.getPrice()));
        } catch (ServiceNotFoundException e) {
            log.info("Service ({}) not found! Message: {}", id,
                    e.getMessage());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        }
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Delete")
    public void delete(@PathVariable Integer id) {
        log.info("Deleting Service {}", id);
        try {
            service.delete(id);
        } catch (ServiceNotFoundException e) {
            log.info("Service ({}) not found! Message: {}", id,
                    e.getMessage());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        }
    }

}
