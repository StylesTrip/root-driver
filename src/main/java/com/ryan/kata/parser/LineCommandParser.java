package com.ryan.kata.parser;

import com.ryan.kata.driver.Driver;

public class LineCommandParser {

    public Driver parseDriver(String lineToParse) {
        String[] lineParts = lineToParse.split(" ");

        return new Driver(lineParts[1]);
    }

    public void parseTrip(Driver driver, String lineToParse) {
        String[] lineParts = lineToParse.split(" ");
        driver.addMiles(Double.parseDouble(lineParts[4]));
    }
}
