package com.qalens.fizzbuzz;

public class NumberConverter {
    int number;
    public NumberConverter(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number+"";
    }
}
