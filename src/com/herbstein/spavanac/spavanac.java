package com.herbstein.spavanac;

import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m -= 45;
        if (m < 0) {
            h--;
            m += 60;
            if (h < 0) {
                h = 23;
            }
        }

        System.out.println(h + " " + m);
    }
}
