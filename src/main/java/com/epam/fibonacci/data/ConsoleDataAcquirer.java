package com.epam.fibonacci.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    @Override
    public Integer[] getData(Integer[] arr) {
        System.out.println("Input numbers: ");
        try(Scanner in = new Scanner(System.in)){
            for (int i = 0; i < arr.length; i++){
                arr[i] = in.nextInt();
            }
        }
        return arr;
    }
}
