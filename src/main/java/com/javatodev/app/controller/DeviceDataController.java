package com.javatodev.app.controller;

import com.javatodev.app.dto.CommonAPIResponse;
import com.javatodev.app.dto.DeviceDataDto;
import com.javatodev.app.service.DeviceDataService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/devices")
public class DeviceDataController {

    private final DeviceDataService deviceDataService;

    @GetMapping
    public ResponseEntity<List<DeviceDataDto>> readDeviceData () {
        return ResponseEntity.ok(deviceDataService.readDeviceData());
    }

    @PostMapping
    public ResponseEntity<CommonAPIResponse> createDeviceData (@RequestBody DeviceDataDto dataDto) {
        deviceDataService.createDeviceData(dataDto);
        return ResponseEntity.ok(CommonAPIResponse
            .builder()
            .message("Device data created successfully completed.")
            .build());
    }

}
