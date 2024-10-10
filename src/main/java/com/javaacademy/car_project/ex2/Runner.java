package com.javaacademy.car_project.ex2;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileWriter;

public class Runner {

    public static void main(String[] args) {

        try {
            write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    private static void write() {
        @Cleanup FileWriter writer = new FileWriter("my_file.txt");
        @Cleanup FileWriter writer2 = new FileWriter("my_file.txt");
        writer.write("Какой то текст");
    }
}
