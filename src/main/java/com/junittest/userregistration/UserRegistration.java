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
        pattern = Pattern.compile("[0-9]{2}\\s[0-9]{10}$");
        matcher = pattern.matcher(mobNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validEmailId(String emailId) {
        pattern = Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
        matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    public boolean validPassword(String password) {
       pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#$%]){1}.{8,}$");
       // pattern=Pattern.compile("^(?=.*?[A-Z]).{8,}$");


        matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

}


