package com.javaacademy.car_project;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

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
