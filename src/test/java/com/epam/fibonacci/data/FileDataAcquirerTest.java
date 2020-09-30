package com.epam.fibonacci.data;

import com.epam.fibonacci.impl.FirstArray;
import org.junit.Assert;
import org.junit.Test;

public class FileDataAcquirerTest {
    private final static String FILE_NAME = "src/test/resources/input.txt";

    FirstArray firstArray = new FirstArray(12);

    @Test
    public void testGetDataShouldReadFromFileWhenFileExists() throws DataExeption {
        FileDataAcquirer acquirer = new FileDataAcquirer(FILE_NAME);
        Integer[] actual = acquirer.getData(firstArray.getFirstArray());
        Assert.assertArrayEquals(new Integer[]{22, 55, 67, 1, 5, 9, 48, 32, 22, 11, 7, 999}, actual);

    }
}
