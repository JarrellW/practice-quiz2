package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    private List<Integer> l = new ArrayList<>();

    public Boolean add(Integer i) {
        l.add(i);

        return l.contains(i);
    }

    public Integer size() {
        return l.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> u = new HashSet<>();
        for (Integer numbers : l) {
            u.add(numbers);
        }
        return new ArrayList<>(u);
    }

    public String join() {

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : l) {
            if (l.indexOf(integer) == 0) {
                stringBuilder.append(integer);
            } else {
                stringBuilder.append(", " + integer);
            }
        }
        String stringResult = stringBuilder.toString();
        return stringResult;
    }

    public Integer mostCommon() {
        Integer mostCommonValue = null;
        Integer mostCommonNoOccurrences = Integer.MIN_VALUE;
        for (Integer integer : l) {
            Integer noOccurrences = Collections.frequency(l, integer);
            if (noOccurrences > mostCommonNoOccurrences) {
                mostCommonValue = integer;
                mostCommonNoOccurrences = noOccurrences;
            }
        }return mostCommonValue;
    }

    public Boolean contains(Integer valueToAdd) {
        return l.contains(valueToAdd);
    }
}
