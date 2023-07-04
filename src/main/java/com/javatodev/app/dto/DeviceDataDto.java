package com.javatodev.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDataDto {
    private String device_model_id;
    private String device_model;
    private String serial_number;
}
