package com.epam.fibonacci.logic;
import java.util.ArrayList;

public class Calculator {

    public void insertSort(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            int index = i;
            int temp = arr[i];

            while (index > 0 && arr[index - 1] >= temp){
                arr[index] = arr[index - 1];
                index--;
            }

            arr[index] = temp;
        }
    }

    public void findFibonacciNumbers(ArrayList<Integer> arr, Integer[] firstArray, Integer[] fibonacciArray){
        for (int i: firstArray){
            for (long j: fibonacciArray){
                if (!arr.contains(i) && i == j){
                    arr.add(i);
                }
            }
        }
    }
}
