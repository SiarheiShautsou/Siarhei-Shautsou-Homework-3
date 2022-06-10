package com.sheva.util;

public class NumberCheck {

    public static boolean evenNumber(int number){

        boolean checkedNumber;
        if(number % 2 == 0){
            checkedNumber = true;
        }else
            checkedNumber = false;
        return checkedNumber;
    }
}
