package hu.uni.eku.team3.controller;


import hu.uni.eku.team3.controller.dto.EmployeeDto;
import hu.uni.eku.team3.controller.dto.PositionDto;
import hu.uni.eku.team3.model.Employee;
import hu.uni.eku.team3.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/Employee")
@RequiredArgsConstructor
@Api(tags="Employee")
@Slf4j
public class EmployeeController{

    private final EmployeeService employeeService;
    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Get employee")
    public Collection<EmployeeDto> readAll(){
        return employeeService.readAll().stream().map(employee ->
                EmployeeDto.builder()
                        .id(employee.getId())
                        .positionID(employee.getPositionID())
                        .employeeName(employee.getEmployeeName())
                        .employeeEmail(employee.getEmployeeEmail())
                        .pwd(employee.getPwd())
                        .build()
        ).collect(Collectors.toList());
    }
}