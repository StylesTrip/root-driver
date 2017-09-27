package com.ryan.kata;

import com.ryan.kata.driver.Driver;
import com.ryan.kata.parser.LineCommandParser;
import org.junit.Assert;
import org.junit.Test;

public class LineCommandParserTest {

    @Test
    public void parser_returns_Driver_when_first_command_is_Driver() {
        String driverLine = "Driver Peter";
        LineCommandParser lineCommandParser = new LineCommandParser();

        Driver driver = lineCommandParser.parse(driverLine);

        Assert.assertNotNull(driver);
    }
}
