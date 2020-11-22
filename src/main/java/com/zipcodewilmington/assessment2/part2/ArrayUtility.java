package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] answer = new Integer[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            answer[i] = array1[i];

        }
        for (int i = array1.length; i < answer.length; i++) {
            answer[i] = array2[i - array1.length];

        }
        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] answer = new Integer[array.length];
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < index; i++) {
           Integer rotate = list.remove(0);
            list.add(rotate);
        }
        answer = list.toArray(answer);
        return list.toArray(answer);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;
        Integer[] combined = merge(array1, array2);
        for (int i = 0; i < combined.length; i++) {
            if(combined[i].equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, mostCount;
        Integer mostUsed = array[0];
        Integer most = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            most = array[i];
            mostCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (most == array[j])
                    mostCount++;
            }
            if (mostCount > count)
            {
                mostUsed = most;
                count = mostCount;
            }
        }
        return mostUsed;
    }
}
