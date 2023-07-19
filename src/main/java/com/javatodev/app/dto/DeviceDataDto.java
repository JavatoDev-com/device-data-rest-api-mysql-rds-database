package com.javatodev.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDataDto implements Serializable {
    private String device_model_id;
    private String device_model;
    private String serial_number;
}
