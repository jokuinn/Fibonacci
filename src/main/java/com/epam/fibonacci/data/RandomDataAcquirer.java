package com.epam.fibonacci.data;

import java.util.Random;

public class RandomDataAcquirer implements DataAcquirer {

    @Override
    public Integer[] getData(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length) + 1;
        }
        return arr;
    }
}
