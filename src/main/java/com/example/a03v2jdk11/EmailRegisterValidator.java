package com.example.a03v2jdk11;
import java.util.function.Predicate;

public class EmailRegisterValidator implements Predicate<String> {

    @Override
    public boolean test(String emailAddress) {
        String poss = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; //will check for upper and lower case chars
        return emailAddress.matches(poss); // return true or false
    }
}
