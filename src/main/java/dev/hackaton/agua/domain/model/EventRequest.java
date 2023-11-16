package dev.hackaton.agua.domain.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer activity;
    private String time;
    private Integer user;
    private String name;
    private BigDecimal consumption;

}
