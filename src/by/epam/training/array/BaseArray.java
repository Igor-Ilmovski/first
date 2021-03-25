package by.epam.training.array;

import org.apache.logging.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class BaseArray {
    private static final Logger log = LogManager.getLogger("baseArray");

    int array_Length = 0;
    Object arr[];

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.debug("application baseArray started.");

        log.debug("application baseArray finished.");
    }

    public void setArraySize(int arrLength) {
        this.array_Length = arrLength;
    }

    public void initArray(int arrLength) {
        setArraySize(arrLength);
        Object[] arr = new Object[array_Length];
    }

/*  public void fillArrayZeroed() {
        for (int i = 0; i < arr.length; i++) {
            Object arr[i] = Integer.valueOf(0);
        }
    }*/

    public int getArraySize() {
        return array_Length;
    }

    public void setArray(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "baseArray{" +
                "arrSize=" + array_Length +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result = prime * result + (arr[i].hashCode());
        }
        return result;
    }

/*
    @Override
    public int compareTo(baseArray inp) {
        if (this.arr.hashCode() != inp.hashCode()) {
            return this.arr.hashCode() - inp.hashCode();
        }
        return 0;
    }*/

    public boolean equals(BaseArray inp) {
        if (this == inp)
            return true;
        if (!super.equals(inp))
            return false;
        if (getClass() != inp.getClass())
            return false;
        BaseArray other = (BaseArray) inp;
        if (array_Length != other.array_Length)
            return false;
        return true;
    }
}
