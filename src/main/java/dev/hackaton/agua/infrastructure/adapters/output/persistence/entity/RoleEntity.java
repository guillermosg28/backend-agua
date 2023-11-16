package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ROLES")
@NoArgsConstructor
@Getter
@Setter
public class RoleEntity implements Serializable {

    private final static long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roles_id", nullable = false)
    private Long id;

    @Column(name = "roles_role_name", nullable = false)
    private String roleName;

    @Column(name = "roles_role_description")
    private String roleDescription;

}
