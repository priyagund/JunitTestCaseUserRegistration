package com.junittest.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;

    public boolean validateFirstName(String firstName) {
        pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }


    }

    public boolean validateLastName(String lastName) {
        pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMobNumber(String mobNumber) {
        pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
        matcher = pattern.matcher(mobNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }
}


