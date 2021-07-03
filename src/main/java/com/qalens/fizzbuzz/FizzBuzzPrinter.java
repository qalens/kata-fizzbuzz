package com.qalens.fizzbuzz;

public class FizzBuzzPrinter {
    public static void main(String[] args){
        for(int i = 1;i<=100;i++){
            System.out.println(new NumberConverter(i));
        }
    }
}
