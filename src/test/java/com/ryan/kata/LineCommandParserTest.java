package com.ryan.kata;

import com.ryan.kata.driver.Driver;
import com.ryan.kata.parser.LineCommandParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineCommandParserTest {

    private LineCommandParser lineCommandParser;

    @Before
    public void setup() {
        lineCommandParser = new LineCommandParser();
    }

    @Test
    public void parser_returns_Driver_when_first_command_is_Driver() {
        String driverLine = "Driver Peter";
        Driver driver = lineCommandParser.parse(driverLine);

        Assert.assertNotNull(driver);
    }

    @Test
    public void parser_returns_Driver_with_proper_name() {
        String driverLine = "Driver Peter";
        Driver driver = lineCommandParser.parse(driverLine);

        Assert.assertEquals("Peter", driver.getDriverName());
    }

    @Test
    public void parser_parses_trip_info() {
        String driverLine = "Driver Peter";
        Driver driver = lineCommandParser.parse(driverLine);

        String tripLine = "Trip Peter 01:00 02:00 10.0";
        lineCommandParser.parseTrip(driver, tripLine);

        Assert.assertEquals(10, driver.getTotalMilesDriven(), 0);
    }
}
