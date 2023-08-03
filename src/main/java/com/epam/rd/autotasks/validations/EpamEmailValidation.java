package com.epam.rd.autotasks.validations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        String domain = "@epam.com";
        if (email == null || ! email.endsWith(domain)) return false;

        Matcher matcher = Pattern.compile("([a-z]_[a-z])").matcher(email);

        return matcher.find();
    }
}





