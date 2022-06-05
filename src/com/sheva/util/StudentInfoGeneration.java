package com.sheva.util;

import java.util.Random;

public class StudentInfoGeneration {

    public static String nameGenerator(){
        final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = new Random().nextInt(4) + 8;
            for(int i = 0; i < length; i++) {
                builder.append(letters.charAt(new Random().nextInt(letters.length())));
            }
        }
        return builder.toString();
    }

    public static int generatorID(){

        int minValue = 100000;
        int maxValue = 999999;

        int randomID = new Random().nextInt(minValue, maxValue);

        return randomID;
    }

}
