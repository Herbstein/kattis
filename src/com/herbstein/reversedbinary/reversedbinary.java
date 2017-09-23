package com.herbstein.reversedbinary;

import java.util.Scanner;

public class reversedbinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();
        String bin = getBinary(dec);
        System.out.println(getDec(new StringBuilder(bin).reverse().toString()));
    }

    private static int getDec(String bin) {
        int dec = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            dec += Integer.parseInt(String.valueOf(bin.charAt(i))) * (int) Math.pow(2, i);
        }
        return dec;
    }

    private static String getBinary(int dec) {
        if (dec <= 1) {
            return String.valueOf(dec);
        }

        int rem = dec % 2;
        return String.valueOf(rem) + getBinary(dec >> 1);
    }
}
