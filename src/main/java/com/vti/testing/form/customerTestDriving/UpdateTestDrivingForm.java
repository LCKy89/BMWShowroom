package com.vti.testing.form.customerTestDriving;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTestDrivingForm {
    private int id;
    private String fullName;
    private String carName;  // Thay vì carId, bạn có thể trực tiếp nhập tên xe
    private String phoneNumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateTestDriving;
}
