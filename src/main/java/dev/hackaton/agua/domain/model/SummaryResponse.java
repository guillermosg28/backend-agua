package dev.hackaton.agua.domain.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SummaryResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user;
    private Double totalConsumption;
    private Double averageConsumption;

}
