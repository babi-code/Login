package com.example.login.Validation;

public class PasswordException extends Throwable {
    public PasswordException(String errorMessage) {
        super(errorMessage);
    }
}
