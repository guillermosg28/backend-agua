package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_ACTIVITIES")
@Getter
@Setter
@NoArgsConstructor
public class UserActivitiesEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_activities_id", nullable = false)
    private Long id;


    @Column(name = "user_activities_user_id")
    private Long userId;

    @Column(name = "user_activities_time")
    private Date creationTime;

    @Column(name = "user_activities_activity")
    private Long activity;

    @Column(name = "user_activities_consumption")
    private float consumption;


}
