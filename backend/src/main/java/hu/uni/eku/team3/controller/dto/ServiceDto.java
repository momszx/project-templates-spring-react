package hu.uni.eku.team3.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceDto {
    private Integer id;
    private String name;
    private int price;
}
