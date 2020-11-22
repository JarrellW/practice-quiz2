package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        if(input % 3 == 0){
            return true;
        }

        return false;
    }

    public Boolean isTang() {
        if(input % 5 == 0){
            return true;
        }
        return false;
    }

    public Boolean isWuTang() {
        if(input % 15 == 0){
            return true;
        }
        return false;
    }
}
