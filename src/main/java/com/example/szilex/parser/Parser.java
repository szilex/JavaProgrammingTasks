package com.example.szilex.parser;

public class Parser {
    public static int parseInt(String numberString) {

        StringInputFormatter formatter = new StringInputFormatter();
        String[] formattedNumberString = formatter.formatString(numberString);

        int result = 0;

        for (String value : formattedNumberString) {
            System.out.println(value.toUpperCase());
            result += NumberString.valueOf(value.toUpperCase()).value;
        }

        return result;
    }

    public static void main(String[] args) {
        parseInt("one");
    }
}
