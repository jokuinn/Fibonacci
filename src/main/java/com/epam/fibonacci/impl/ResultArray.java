package com.epam.fibonacci.impl;

import java.util.ArrayList;

public class ResultArray {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    public ArrayList<Integer> getResultArray() {
        return arr;
    }

    @Override
    public String toString() {
        return "Fibonacci numbers from first array: " +
                arr;
    }
}
