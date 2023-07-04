package com.javatodev.app.service;

import com.javatodev.app.dto.DeviceDataDto;
import com.javatodev.app.entity.DeviceDataEntity;
import com.javatodev.app.mapper.DeviceDataMapper;
import com.javatodev.app.repository.DeviceDataRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeviceDataService {

    private final DeviceDataRepository deviceDataRepository;
    
    DeviceDataMapper deviceDataMapper = new DeviceDataMapper();

    public List<DeviceDataDto> readDeviceData() {
        List<DeviceDataEntity> deviceData = deviceDataRepository.findAll();
        return deviceDataMapper.convertToDtoList(deviceData);
    }

    public void createDeviceData(DeviceDataDto dataDto) {
        DeviceDataEntity deviceDataEntity = deviceDataRepository.save(deviceDataMapper.convertToEntity(dataDto));
        log.info("Device data created {}", deviceDataEntity.getId());
    }
}
