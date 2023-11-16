package dev.hackaton.agua.application.ports.output;

import dev.hackaton.agua.domain.model.UserResponse;

/**
 * The interface User output port.
 */
public interface UserOutputPort {

    UserResponse _loginUser(String email, String password);
}
