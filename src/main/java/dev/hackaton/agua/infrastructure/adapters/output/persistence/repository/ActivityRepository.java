package dev.hackaton.agua.infrastructure.adapters.output.persistence.repository;

import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Activity repository.
 */

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {

}
