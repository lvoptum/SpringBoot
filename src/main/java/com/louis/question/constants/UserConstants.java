package com.louis.question.constants;

public class UserConstants {

    public static final String USER_EMPTY = "The User field is empty";

    public static final String EMAIL_ADDRESS_EMPTY = "The Email Address is empty";

    public static final String EMAIL_ADDRESS_INCORRECT = "The Email Address is incorrect";

    public static final String USER_CORRECT = "The User Entered was correctly added";

    public static final Long SUCCESS_CODE = 200L;

    public static final String EMAIL_PATTERN = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b"; //Spring EmailValidator for JPA
}
