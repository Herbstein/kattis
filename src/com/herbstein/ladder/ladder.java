package com.herbstein.ladder;

import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int v = scanner.nextInt();

        int b = (int)Math.ceil(h * Math.sin(Math.toRadians(90)) * (1 / Math.sin(Math.toRadians(v))));
        System.out.println(b);
    }
}
