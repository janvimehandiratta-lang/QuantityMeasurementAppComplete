package com.app.quantitymeasurement.repositoryImpl;


import com.app.quantitymeasurement.entity.Entity;
import com.app.quantitymeasurement.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class CacheRepository implements Repository {

    private static CacheRepository instance;

    private final List<Entity> cache = new ArrayList<>();

    //constructor
    private CacheRepository() {
    }

    public static CacheRepository getInstance() {
        if (instance == null) {
            instance = new CacheRepository();
        }
        return instance;
    }

    @Override
    public void save(Entity entity) {
        cache.add(entity);
    }

    @Override
    public List<Entity> getAllMeasurements() {
        return List.of();
    }

    @Override
    public List<Entity> getMeasurementsByOperation(String operationType) {
        return List.of();
    }

    @Override
    public List<Entity> getMeasurementsByType(String measurementType) {
        return List.of();
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long getTotalCount() {
        return 0;
    }
}