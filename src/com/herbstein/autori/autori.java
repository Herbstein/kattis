package com.herbstein.autori;

import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String[] names = name.split("-");

        for (String s : names) {
            System.out.print(s.charAt(0));
        }

        // System.out.println(name);
    }
}
