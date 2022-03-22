package ru.skypro;

import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
// Задача 1 ================================================
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("---------   Конец задачи 1 ---------  ");

// Задача 2 ================================================
        fullName = fullName.toUpperCase();
        System.out.println(fullName);
        System.out.println(" ---------  Конец задачи 2 ---------  ");
        replaceCharYo();
    }
// Задача 3 ================================================
    public static void replaceCharYo() {
        String fullName = "Иванов Семён Семёнович";
        String yo = "ё";
        if (fullName.contains(yo)) {
            fullName = fullName.replace(yo, "е");
        } else {
            throw new RuntimeException("Такой буквы нет в строке!");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}