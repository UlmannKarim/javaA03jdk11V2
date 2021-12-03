package com.example.a03v2jdk11;
import java.util.function.Predicate;

public class EmailRegisterValidator implements Predicate<String> {

    @Override
    public boolean test(String emailAddress) {
        String poss = "^[._%+A-Za-z0-9-]+@[A-Z0-9a-z.-]+\\.[A-Za-z]{2,6}$"; //will check for upper and lower case chars
        return emailAddress.matches(poss); // return true or false
    }
}
