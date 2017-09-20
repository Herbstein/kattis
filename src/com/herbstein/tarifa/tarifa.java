package com.herbstein.tarifa;

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthlyCap = scanner.nextInt();
        int n = scanner.nextInt();

        int cumCap = 0;
        for (int i  = 0; i < n; i++) {
            int monthUsage = scanner.nextInt();
            cumCap += monthlyCap;
            cumCap -= monthUsage;
        }

        System.out.println(cumCap+monthlyCap);
    }
}
