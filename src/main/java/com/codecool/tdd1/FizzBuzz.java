package com.codecool.tdd1;

// %3 -> Fizz
// %5 -> Buzz
// %7 -> Qooz
public class FizzBuzz {

    public String calculate(int num) {
        StringBuilder res = new StringBuilder();
        if (num %3 == 0) {
            res.append("Fizz");
        }
        if (num %5 == 0) {
            res.append("Buzz");
        }
        if (num %7 == 0) {
            res.append("Qooz");
        }

        return res.length() == 0 ? "" + num : res.toString();
    }

}
