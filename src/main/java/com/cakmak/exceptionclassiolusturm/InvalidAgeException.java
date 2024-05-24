package com.cakmak.exceptionclassiolusturm;

import java.io.IOException;

public class InvalidAgeException/* bu bir checked hatasıdır*/ extends IOException /*checked bir hatadır*/ /*ArithmeticException *//*bu bir unchecked hatasıdır*/{
    public InvalidAgeException(String message){
        super(message);

    }
    @Override
    public void printStackTrace() {
        System.out.println("bu bir invalid age hatasıdır.");
    }

}
