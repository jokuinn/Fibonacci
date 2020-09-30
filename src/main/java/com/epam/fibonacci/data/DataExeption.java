package com.epam.fibonacci.data;

public class DataExeption extends Exception {

    public DataExeption(String message, Exception e){
        super(message, e);
    }
}
