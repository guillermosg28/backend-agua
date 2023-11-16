package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "ROLES")
@Data
public class RoleEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roles_id", nullable = false)
    private Long id;

    @Column(name = "roles_role_name", nullable = false)
    private String roleName;

    @Column(name = "roles_role_description")
    private String roleDescription;

    public RoleEntity() {
    }

    public RoleEntity(Long id, String roleName, String roleDescription) {
        this.id = id;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }
}
