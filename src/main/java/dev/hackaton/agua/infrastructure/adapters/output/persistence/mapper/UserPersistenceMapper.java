package dev.hackaton.agua.infrastructure.adapters.output.persistence.mapper;

import dev.hackaton.agua.domain.model.UserResponse;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

/**
 * The interface User persistence mapper.
 */

@Mapper
public interface UserPersistenceMapper {

    UserResponse toUserResponse(UserEntity userEntity);
}
