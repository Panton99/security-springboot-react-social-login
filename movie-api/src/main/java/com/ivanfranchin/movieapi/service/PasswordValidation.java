package com.ivanfranchin.movieapi.service;

import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import org.springframework.stereotype.Component;

@Component
public class PasswordValidation {
    public boolean isPasswordStrong(String password) {
        Zxcvbn zxcvbn = new Zxcvbn();
        Strength strength = zxcvbn.measure(password);

        return strength.getScore() > 3;
    }
}