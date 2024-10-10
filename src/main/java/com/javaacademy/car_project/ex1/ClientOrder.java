package com.javaacademy.car_project.ex1;

import lombok.*;

//@AllArgsConstructor
//@Getter
//@ToString
//@EqualsAndHashCode
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Value
public class ClientOrder {
    String email;
    String phone;
    String concertName;
    String name;
}
