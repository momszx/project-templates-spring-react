package hu.uni.eku.team3.controller;

import hu.uni.eku.team3.controller.dto.PositionDto;
import hu.uni.eku.team3.service.PositionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Position")
@RequiredArgsConstructor
@Api(tags = "Position")
@Slf4j

public class PositionController {

    private final PositionService positionService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Read all position")
    public Collection<PositionDto> readAll() {
        return positionService.readAll().stream().map(position ->
                PositionDto.builder()
                        .id(position.getId())
                        .name(position.getName())
                        .build()
        ).collect(Collectors.toList());
    }

}