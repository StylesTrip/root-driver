package com.ryan.kata.parser;

import com.ryan.kata.driver.Driver;

public class LineCommandParser {

    public Driver parse(String lineToParse) {
        String[] lineParts = lineToParse.split(" ");

        return new Driver(lineParts[1]);
    }
}
