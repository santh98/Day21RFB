package com.bridgelabz.rfb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String value) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastname(String Lastname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Lastname);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String Email) {
        Pattern pattern3 = Pattern.compile("^[0-9a-zA-Z]+([a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");
        Matcher matcher3 = pattern3.matcher(Email);
        if (matcher3.matches())
            return true;
        else
            return false;
    }
    public boolean validatPhoneNumber(String mobileNumber){
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher(mobileNumber);
        if(matcher4.matches())
            return true;
        else
            return false;
    }
    public boolean validatePassword(String password)
    {
        Pattern pattern5 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$");
        Matcher matcher5 = pattern5.matcher(password);
        if (matcher5.matches())
            return true;
        else
            return false;
    }

}
