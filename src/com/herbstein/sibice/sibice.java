package com.herbstein.sibice;

import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int match = scanner.nextInt();
            if (match <= w || match <= h || (match <= Math.sqrt(w*w+h*h))) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
