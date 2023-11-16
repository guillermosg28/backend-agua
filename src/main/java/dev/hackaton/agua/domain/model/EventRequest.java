package dev.hackaton.agua.domain.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest implements Serializable {

//    private static final long serialVersionUID = 1L;

    @NotNull(message = "A valid activity must be provided!")
    private Long activity;

    @NotBlank(message = "Time is mandatory")
    private String time;

    @NotBlank(message = "A valid user must be provided!")
    private Long user;
    private String name;

    @NotNull(message = "value for consumption is mandatory")
    private double consumption;

}
