package com.epam.fibonacci.data;

import java.io.*;

public class FileDataAcquirer implements DataAcquirer{

    private String filename;

    public FileDataAcquirer(String filename){
        this.filename = filename;
    }


    @Override
    public Integer[] getData(Integer[] arr) throws DataExeption {
        try{
            BufferedReader input = new BufferedReader(new FileReader(filename));
            String[] split = input.readLine().split(" ");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = Integer.parseInt(split[i]);
            }
            return arr;
        } catch (IOException e) {
            throw new DataExeption(e.getMessage(), e);
        }
    }
}
