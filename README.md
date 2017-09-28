# root-driver
My solution to Root's kata found here: https://gist.github.com/dan-manges/1e1854d0704cb9132b74
More to come soon

Ideas: Separation of concerns
Driver class to keep track of each named driver and mileage
DriverHistory to keep track of ALL drivers and add up mileage/add up time
LineCommandParser to parse each text line

Main class which take in file location and read each line, sending it to LineCommandParser or DriverHistory class which
will then call LineCommandParser
