package dev.hackaton.agua.infrastructure.adapters.input.rest;

import dev.hackaton.agua.application.ports.input.UserCase;
import dev.hackaton.agua.infrastructure.adapters.input.rest.data.UserLoginRequestDto;
import dev.hackaton.agua.infrastructure.adapters.input.rest.data.UserLoginResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Users rest adapter.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/")
public class UsersRestAdapter implements UsersApi{

    private final UserCase userCase;
    
    @Override
    public ResponseEntity<UserLoginResponseDto> _loginUser(UserLoginRequestDto userLoginRequestDto) {
        return null;
    }
}
