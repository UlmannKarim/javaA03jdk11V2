package com.example.a03v2jdk11;

import java.util.function.Predicate;

public class PasswordDigit implements Predicate<String> {
    @Override
    public boolean test(String Password) {
        Integer i = 0;
        while (i <= Password.length()){
            String stringInt = Integer.toString(i);
            if (Password.contains(stringInt)) {
                return true;
            }
            i++;
        }
        return false;
    }
}