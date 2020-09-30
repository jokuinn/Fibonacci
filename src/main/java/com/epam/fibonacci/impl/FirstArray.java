package com.epam.fibonacci.impl;

import java.util.Arrays;

public class FirstArray {
    Integer[] array;

    public FirstArray(int length){
        this.array = new Integer[length];
    }

    public FirstArray(Integer[] array){
        this.array = array;
    }

    public Integer[] getFirstArray() {
        return array;
    }

    public void setArray(int index, int value) {
        array[index] = value;
    }

    @Override
    public String toString() {
        return "First array:" +
                Arrays.toString(array);
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
