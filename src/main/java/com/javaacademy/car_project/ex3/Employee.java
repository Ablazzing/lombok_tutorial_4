package com.javaacademy.car_project.ex3;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
@ToString(callSuper = true)
public class Employee extends Human {
    private BigDecimal salary;
}
