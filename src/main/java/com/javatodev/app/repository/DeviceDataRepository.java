package com.javatodev.app.repository;

import com.javatodev.app.entity.DeviceDataEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceDataRepository extends JpaRepository<DeviceDataEntity, Long> {
}
