package com.app.quantitymeasurement.repositoryImpl;

import com.app.quantitymeasurement.entity.Entity;
import com.app.quantitymeasurement.repository.QuantityMeasurementRepository;
import com.app.quantitymeasurement.repository.Repository;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Primary
@org.springframework.stereotype.Repository
public class JpaMeasurementRepositoryAdapter implements Repository {

    private final QuantityMeasurementRepository repository;

    public JpaMeasurementRepositoryAdapter(QuantityMeasurementRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Entity entity) {
        repository.save(entity);
    }

    @Override
    public List<Entity> getAllMeasurements() {
        return repository.findAll();
    }

    @Override
    public List<Entity> getMeasurementsByOperation(String operationType) {
        return repository.findByOperationType(operationType);
    }

    @Override
    public List<Entity> getMeasurementsByType(String measurementType) {
        return repository.findByMeasurementType(measurementType);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public long getTotalCount() {
        return repository.count();
    }

    public List<Entity> getErroredMeasurements() {
        return repository.findByErrorTrue();
    }

    public long countSuccessfulByOperation(String operationType) {
        return repository.countByOperationTypeAndErrorFalse(operationType);
    }
}