package com.herbstein.trik;

import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.next();

        int index = 1;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'A':
                    if (index == 1) {
                        index = 2;
                    } else if (index == 2) {
                        index = 1;
                    }
                    break;
                case 'B':
                    if (index == 2) {
                        index = 3;
                    } else if (index == 3) {
                        index = 2;
                    }
                    break;
                case 'C':
                    if (index == 3) {
                        index = 1;
                    } else if (index == 1) {
                        index = 3;
                    }
                    break;
            }
        }

        System.out.println(index);
    }
}

