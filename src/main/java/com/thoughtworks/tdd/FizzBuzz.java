package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int i) {
        String result = "";
        result += getMappingString(i, 3, "Fizz");
        result += getMappingString(i, 5, "Buzz");
        result += getMappingString(i, 7, "Whizz");
        if(result.equals("")){
            return String.valueOf(i);
        }
        return result;
    }

    private String getMappingString(int i, int i2, String fizz) {
        if (i % i2 == 0) {
            return fizz;
        }
        return "";
    }
}
