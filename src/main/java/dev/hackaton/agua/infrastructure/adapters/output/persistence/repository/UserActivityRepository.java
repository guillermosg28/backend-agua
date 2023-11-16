package dev.hackaton.agua.infrastructure.adapters.output.persistence.repository;

import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserActivitiesEntity;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityRepository extends JpaRepository<UserActivitiesEntity, Long>{

}
