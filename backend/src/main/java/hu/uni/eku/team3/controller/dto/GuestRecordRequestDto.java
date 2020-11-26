package hu.uni.eku.team3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestRecordRequestDto {
    private String id;
    private String name;
    private Date dateOfBirth;
    private Date arrivalDate;
    private Date departureDate;
}
