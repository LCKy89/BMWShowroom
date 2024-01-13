package com.vti.testing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vti.testing.entity.Car;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CustomerTestDrivingDto {
    private int id;
    private String fullName;
    private String phoneNumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateTestDriving;
    private Car carName;

}
