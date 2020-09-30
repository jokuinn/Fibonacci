package com.epam.fibonacci.data;

public class DataAcquirerFactory {
    public DataAcquirer createDataAcquirer(){
        //return new ConsoleDataAcquirer();
        //return new FileDataAcquirer("src/test/resources/input.txt");
        return new RandomDataAcquirer();
    }
}
