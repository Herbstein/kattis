package com.herbstein.coldputerscience;

import java.util.Scanner;

public class coldputerscience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lessThanZero = 0;

        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() < 0) {
                lessThanZero++;
            }
        }

        System.out.println(lessThanZero);
    }
}
