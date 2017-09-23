package com.herbstein.modulo;

import java.util.HashSet;
import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> values = new HashSet<>();

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            values.add(n % 42);
        }

        System.out.println(values.size());
    }
}
