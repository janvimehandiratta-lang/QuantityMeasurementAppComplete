package com.app.quantitymeasurement.repository;



import com.app.quantitymeasurement.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Repository
public interface QuantityMeasurementRepository extends JpaRepository<Entity, Long> {

    List<Entity> findByOperationType(String operationType);

    List<Entity> findByMeasurementType(String measurementType);

    List<Entity> findByCreatedAtAfter(LocalDateTime date);

    @Query("""
            select e
            from Entity e
            where e.operationType = :operationType
            and e.error = false
            """)
    List<Entity> findSuccessfulByOperationType(String operationType);

    long countByOperationTypeAndErrorFalse(String operationType);

    List<Entity> findByErrorTrue();
}