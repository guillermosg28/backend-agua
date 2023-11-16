package dev.hackaton.agua.infrastructure.adapters.output.persistence.repository;

import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.MonthlyConsumptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyComsuptionRepository extends JpaRepository<MonthlyConsumptionEntity, Long> {

}
