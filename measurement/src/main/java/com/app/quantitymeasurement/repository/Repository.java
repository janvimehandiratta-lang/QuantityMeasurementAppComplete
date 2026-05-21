package com.app.quantitymeasurement.repository;

import java.util.List;

import com.app.quantitymeasurement.entity.Entity;

public interface Repository{

    // Save measurement
    void save(Entity entity);

    // Get all measurements
    List<Entity> getAllMeasurements();

    // Get by operation type
    List<Entity>
    getMeasurementsByOperation(String operationType);

    // Get by measurement type
    List<Entity>
    getMeasurementsByType(String measurementType);

    // Delete all records
    void deleteAll();

    // Get total count
    long getTotalCount();
}