package com.codegym;

public class Main {
    private static String[] validate = new String[]{"84-0978489648"};
    private static String[] invalidate = new String[]{"a8-22222222"};

    public static void main(String[] args) {
        ValidatePhone validatePhone = new ValidatePhone();
        for (String phone : validate) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalidate) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isvalid);
        }
    }
}
