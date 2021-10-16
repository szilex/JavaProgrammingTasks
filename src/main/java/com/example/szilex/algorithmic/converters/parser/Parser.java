package com.example.szilex.algorithmic.converters.parser;

public class Parser {
    public static int parseInt(String numberString) {

        StringInputFormatter formatter = new StringInputFormatter();
        String[] formattedNumberArray = formatter.formatString(numberString);

        return NumberString.calculateValue(formattedNumberArray);
    }
}
