package dev.hackaton.agua.domain.model;

import lombok.*;

import java.io.Serializable;

/**
 * The model User.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse implements Serializable {

    private static final long serialVersionUID = 1L;

private String id;


}
