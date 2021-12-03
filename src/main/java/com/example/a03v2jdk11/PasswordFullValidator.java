package com.example.a03v2jdk11;

import java.util.function.Predicate;

public class PasswordFullValidator implements Predicate<String> {
    @Override
    public boolean test(String password) {
        //• The length of the password to be at least 7 characters in length.
        //• The password contain at least 1 letter.
        //• The password contain at least 1 digit.
        //• The password contain at least 1 character from *^&@!.
        String fullStrength = "^(?=.*[*^&@!])(?=.*[A-Za-z])(?=.*[0-9]).{7,}$";
        return password.matches(fullStrength);
    }
}
