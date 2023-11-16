package dev.hackaton.agua.domain.service;

import dev.hackaton.agua.application.ports.input.UserCase;
import dev.hackaton.agua.application.ports.output.UserOutputPort;
import dev.hackaton.agua.domain.model.UserResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserService implements UserCase {

    private final UserOutputPort userOutputPort;
    @Override
    public UserResponse _loginUser(String email, String password) {
        return null;
    }
}
