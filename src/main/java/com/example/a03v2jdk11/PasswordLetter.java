package com.example.a03v2jdk11;

import java.util.function.Predicate;

public class PasswordLetter implements Predicate<String> {
    @Override
    public boolean test(String password) {
        String regX = ".*[A-Za-z]+.*";
        return password.matches(regX); // return true or false
    }
}
