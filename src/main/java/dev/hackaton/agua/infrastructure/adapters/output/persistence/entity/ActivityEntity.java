package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Activity entity.
 */

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ACTIVITIES")
public class ActivityEntity implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activities_id", nullable = false)
    private Long id;

    @Column(name = "activities_name", nullable = false)
    private String name;

    @Column(name = "activities_percentage", nullable = false)
    private double percentage;

}
