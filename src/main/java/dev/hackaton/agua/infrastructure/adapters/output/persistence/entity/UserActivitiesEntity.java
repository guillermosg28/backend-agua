package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
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


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_activities_user_id")
    private UserEntity user;

    @Column(name = "user_activities_time")
    private LocalDateTime creationTime;

    @ManyToOne
    @JoinColumn(name = "user_activities_activity")
    private ActivityEntity activityEntity;

    @Column(name = "user_activities_consumption")
    private double consumption;


}
