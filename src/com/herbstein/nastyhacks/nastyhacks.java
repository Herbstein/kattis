package com.herbstein.nastyhacks;

import java.util.Scanner;

public class nastyhacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();

            int choice = r - (e - c);
            if (choice < 0) {
                System.out.println("advertise");
            } else if (choice == 0) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
