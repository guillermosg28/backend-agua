package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "MONTHLY_CONSUMPTION")
@Setter
@Getter
@NoArgsConstructor
public class MonthlyConsumptionEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_activities_id", nullable = false)
    private Long id;


    @Column(name = "monthly_consumption_month")
    private String month;

    @Column(name = "monthly_consumption_consumption")
    private double consumption;

}
