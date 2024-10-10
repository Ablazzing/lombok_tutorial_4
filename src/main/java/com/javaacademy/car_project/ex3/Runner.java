package com.javaacademy.car_project.ex3;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Human human = Human.builder()
                .name("Юрий")
                .secondName("Иванов")
                .build();
        System.out.println(human);

        Employee employee = Employee.builder()
                .name("Юрий")
                .secondName("Петров")
                .salary(BigDecimal.TEN)
                .build();
        System.out.println(employee);
    }
}
