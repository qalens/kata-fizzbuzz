package com.qalens.fizzbuzz;

public class NumberConverter {
    int number;
    public NumberConverter(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(number%3==0)
            return "Fizz";
        return number+"";
    }
}
