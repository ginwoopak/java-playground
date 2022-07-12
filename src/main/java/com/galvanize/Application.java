package com.galvanize;

public class Application {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);

        System.out.println(fizzBuzz(a));
    }

    public static String fizzBuzz(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }
    }
}
