package dev.hackaton.agua.infrastructure.adapters.output.persistence.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "AVERAGE_CONSUMPTION")
@Getter
@Setter
@NoArgsConstructor
public class AverageConsumptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consumption_id", nullable = false)
    private Long id;

    @Column(name = "consumption_barribcn")
    private String barriBcn;

    @Column(name = "consumption_lhabdia")
    private float consumptionAverage;


}
