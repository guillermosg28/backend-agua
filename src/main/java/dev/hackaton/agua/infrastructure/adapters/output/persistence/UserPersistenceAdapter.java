package dev.hackaton.agua.infrastructure.adapters.output.persistence;

import dev.hackaton.agua.application.ports.output.UserOutputPort;
import dev.hackaton.agua.domain.model.UserResponse;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.mapper.UserPersistenceMapper;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements UserOutputPort {

    private final UserRepository userRepository;
    private final UserPersistenceMapper userPersistenceMapper;
    @Override
    public UserResponse _loginUser(String email, String password) {
        return userPersistenceMapper.toUserResponse(userRepository.findByEmailPAndPassword(email, password));
    }
}
