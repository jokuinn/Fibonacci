package com.epam.fibonacci.data;

public interface DataAcquirer {
    Integer[] getData(Integer[] arr) throws DataExeption;
}
