package com.example.login.Validation;

import com.example.login.Model.Log;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class LogValidation {
    public void valid(String password, String emailId) throws PasswordException, EmailException {
        String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        String regex1 = "^([A-Za-z0-9#$&^*_!]+[A-za-z0-9]+@+[a-z]+.+[a-z]{2,4})$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean b = m.matches();
        if(!b){
            throw new PasswordException("password invalid");
        }
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p.matcher(emailId);
        boolean b1 = m.matches();
        if(!b1){
            throw new EmailException("Email invalid");
        }
    }
}
