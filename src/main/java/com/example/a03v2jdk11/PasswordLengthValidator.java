package com.example.a03v2jdk11;

import java.util.function.Predicate;

public class PasswordLengthValidator implements Predicate<String> {
    @Override
    public boolean test(String password) {
        return password.length() >= 7;
    }
}
