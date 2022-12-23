package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static int[] removeLocalMaxima(int[] array){
        int []newArray = new int[array.length];
        int count = 0;
        if (array[0]<=array[1]){
            newArray[count] = array[0];
            count++;
        }
        for (int i = 1; i < array.length-1; i++) {
            if (array[i-1]>=array[i] || array[i]<=array[i+1]){
                newArray[count] = array[i];
                count++;
            }
        }
        if (array[array.length-1]<=array[array.length-2]){
            newArray[count] = array[array.length-1];
            count++;
        }
        //put your code here
        return Arrays.copyOf(newArray,count);
        //throw new UnsupportedOperationException();
    }
}
