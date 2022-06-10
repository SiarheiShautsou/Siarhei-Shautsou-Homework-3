package com.sheva.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StudentInfoGeneration {

    public static String nameGenerator() {

        /* This is a name generator in the range of 3 to 10 characters. */

        int length = (int) (Math.random() * 10 + 3);
        boolean useLetters = true;
        boolean useNumbers = false;

        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static int generatorID() {

        /* This is an ID number generation from six numbers. */

        int minValue = 100000;
        int maxValue = 999999;

        int randomID = new Random().nextInt(minValue, maxValue);

        return randomID;
    }

}
