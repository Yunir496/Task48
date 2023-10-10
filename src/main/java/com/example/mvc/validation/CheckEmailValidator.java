package com.example.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String startOfEmail;

    public void initialize(CheckEmail constraintAnnotation) {
        startOfEmail = constraintAnnotation.value();
    }

    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.startsWith(startOfEmail) && enteredValue.matches(".+@.+\\..+");


    }
}
