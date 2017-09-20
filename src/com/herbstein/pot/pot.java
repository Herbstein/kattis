package com.herbstein.pot;

import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long cum = 0;

        for (int i = 0; i < n; i++) {
            String p = scanner.next();
            String numString = p.substring(0, p.length()-1);
            String powString = p.substring(p.length()-1, p.length());
            int num = Integer.parseInt(numString);
            int pow = Integer.parseInt(powString);
            cum += Math.pow(num, pow);
        }

        System.out.println(cum);
    }
}
