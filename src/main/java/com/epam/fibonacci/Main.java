package com.epam.fibonacci;

import com.epam.fibonacci.data.*;
import com.epam.fibonacci.impl.FibonacciArray;
import com.epam.fibonacci.impl.FirstArray;
import com.epam.fibonacci.impl.ResultArray;
import com.epam.fibonacci.logic.Calculator;
import com.epam.fibonacci.view.ConsoleResultPrinter;
import com.epam.fibonacci.view.ResultPrinter;


public class Main {
    public static void main(String[] args) throws DataExeption {
        //given
        FirstArray firstArray = new FirstArray(12);
        FibonacciArray fibonacciArray = new FibonacciArray();
        ResultArray resultArray = new ResultArray();

        DataAcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer acquirer = factory.createDataAcquirer();
        acquirer.getData(firstArray.getFirstArray());

        //calculate
        Calculator calculator = new Calculator();
        calculator.insertSort(firstArray.getFirstArray());
        calculator.findFibonacciNumbers(resultArray.getResultArray(), firstArray.getFirstArray(), fibonacciArray.getFibonacciArrayArray());

        //print
        ResultPrinter resultPrinter = new ConsoleResultPrinter();
        resultPrinter.print(firstArray.toString());
        resultPrinter.print(fibonacciArray.toString());
        resultPrinter.print(resultArray.toString());
    }
}
