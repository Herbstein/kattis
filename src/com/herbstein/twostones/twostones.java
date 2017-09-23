package com.herbstein.twostones;

import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        System.out.println(n % 2 == 0 ? "Bob" : "Alice");
    }
}
