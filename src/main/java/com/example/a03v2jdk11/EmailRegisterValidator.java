package com.example.a03v2jdk11;
import java.util.function.Predicate;

public class EmailRegisterValidator implements Predicate<String> {

    @Override
    public boolean test(String emailAddress) {
        // regex provided by the OWASP organization
        // https://owasp.org/www-community/OWASP_Validation_Regex_Repository
        String poss = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return emailAddress.matches(poss); // return true or false
    }
}
