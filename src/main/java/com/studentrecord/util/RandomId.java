package com.studentrecord.util;

import java.util.Random;

public class RandomId {
//Generate a number bigger the 1000 and less than 9999 for id number
    public static int randomId(){
        int min = 1000;
        int max = 9999;
        return (int)Math.floor(Math.random()*(max-min+1) + min);

    }

}
