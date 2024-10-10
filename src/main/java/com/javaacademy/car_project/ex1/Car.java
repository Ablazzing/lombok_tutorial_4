package com.javaacademy.car_project.ex1;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Car {
    @Getter
    private String model;
    private int power;
    @Getter
    private BigDecimal price;

    public Car(int power, String model) {
        this.power = power;
        this.model = model;
    }
}
