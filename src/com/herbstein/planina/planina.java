package com.herbstein.planina;

import java.util.Scanner;

public class planina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        System.out.println((int)Math.pow(Math.pow(2, n)+ 1, 2));
    }
}
