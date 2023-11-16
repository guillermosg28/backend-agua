package dev.hackaton.agua.infrastructure.adapters.output.persistence.repository;

import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 */

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmailPAndPassword(String email, String password);
}
