package com.example.a03v2jdk11;

import java.util.function.Predicate;

public class PasswordSpecialChars implements Predicate<String> {
    @Override
    public boolean test(String password) {
        String specialChars = "^(?=.*[*^&@!]).*$";
        return password.matches(specialChars);
    }
}

// "(?=.*[@#$%^&+=])"
// ".*[a-zA-Z]+.*"
// ^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$