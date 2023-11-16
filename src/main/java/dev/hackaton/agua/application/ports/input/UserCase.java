package dev.hackaton.agua.application.ports.input;

import dev.hackaton.agua.domain.model.UserResponse;

/**
 * The interface User use case.
 */
public interface UserCase {

    UserResponse _loginUser(String email, String password);


}
