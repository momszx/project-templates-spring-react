package hu.uni.eku.team3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRecordRequestDto {
    private Integer id;
    private String name;
    private int price;
}
