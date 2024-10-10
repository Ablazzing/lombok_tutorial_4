package com.javaacademy.car_project.ex3;

import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public class Human {
    private String name; //Имя
    private String secondName; //Фамилия
    private String middleName; //Отчество

//    public static class HumanBuilder {
//        private Human human = new Human();
//
//        public HumanBuilder name(String name) {
//            human.name = name;
//            return this;
//        }
//
//        public HumanBuilder secondName(String secondName) {
//            human.secondName = secondName;
//            return this;
//        }
//
//        public HumanBuilder middleName(String middleName) {
//            human.middleName = middleName;
//            return this;
//        }
//
//        public Human build() {
//            return human;
//        }
//    }
//
//    public static HumanBuilder builder() {
//        return new HumanBuilder();
//    }

}
