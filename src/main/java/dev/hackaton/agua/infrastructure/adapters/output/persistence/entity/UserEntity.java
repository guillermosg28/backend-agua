package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type User entity.
 */

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class UserEntity implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id", nullable = false)
    private Long id;

    @Column(name = "users_name")
    private String name;

    @Column(name = "users_first_lastname")
    private String firstLastname;

    @Column(name = "users_second_lastname")
    private String secondLastname;

    @Column(name = "users_id_email", nullable = false, length = 100)
    private String email;

    @Column(name = "users_pass", nullable = false, length = 100)
    private String password;


}
