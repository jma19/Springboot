package com.im.server.utils;

import java.util.Random;

/**
 * Created by majun on 16/3/1.
 */
public class RandomVGenerator {

    private final static char chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static String getRandomValue() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        while (count < 4) {
            int index = random.nextInt(chars.length);
            stringBuilder.append(chars[index]);
            count++;

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(getRandomValue());
    }
}
