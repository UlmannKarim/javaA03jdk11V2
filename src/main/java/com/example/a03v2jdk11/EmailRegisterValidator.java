package com.example.a03v2jdk11;
import java.util.function.Predicate;

public class EmailRegisterValidator implements Predicate<String> {

    @Override
    public boolean test(String emailAddress) {
        String poss = "^(.+)@(.+)$";
        return emailAddress.matches(poss); // return true or false
    }
}
