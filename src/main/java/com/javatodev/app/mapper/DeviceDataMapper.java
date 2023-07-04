package com.javatodev.app.mapper;

import com.javatodev.app.dto.DeviceDataDto;
import com.javatodev.app.entity.DeviceDataEntity;

import org.springframework.beans.BeanUtils;

public class DeviceDataMapper extends DataMapper<DeviceDataEntity, DeviceDataDto> {
    @Override public DeviceDataDto convertToDto(DeviceDataEntity entity, Object... args) {
        if (entity != null) {
            DeviceDataDto deviceDataDto = new DeviceDataDto();
            BeanUtils.copyProperties(entity, deviceDataDto);
            return deviceDataDto;
        }
        return null;
    }

    @Override public DeviceDataEntity convertToEntity(DeviceDataDto dto, Object... s) {
        if (dto != null) {
            DeviceDataEntity entity = new DeviceDataEntity();
            BeanUtils.copyProperties(dto, entity);
            return entity;
        }
        return null;
    }
}
