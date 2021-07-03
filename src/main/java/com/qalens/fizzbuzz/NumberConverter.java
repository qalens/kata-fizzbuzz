package com.qalens.fizzbuzz;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class NumberConverter {
    private static Supplier<Stream<SpeakingNumber>> streamSupplier
            = () -> Stream.of(new SpeakingNumber(15,"FizzBuzz"),new SpeakingNumber(3,"Fizz"),new SpeakingNumber(5,"Buzz"));
    static class SpeakingNumber{
        int number;
        String word;

        public SpeakingNumber(int number, String word) {
            this.number = number;
            this.word = word;
        }
        public boolean isNumberCompatible(int number){
            if (number % this.number == 0){
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return word;
        }
    }
    int number;
    public NumberConverter(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return streamSupplier.get()
                .filter(
                        speakingNumber -> speakingNumber.isNumberCompatible(this.number)
                ).findFirst()
                .map(sn->sn.toString())
                .orElse(number+"");
    }
}
