package com.herbstein.pet;

import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxContestant = 0;
        int maxGrade = 0;

        for (int i = 0; i < 5; i++) {
            int localGrade = 0;
            for (int j = 0; j < 4; j++) {
                localGrade += scanner.nextInt();
            }

            if (maxGrade < localGrade) {
                maxGrade = localGrade;
                maxContestant = i + 1;
            }
        }

        System.out.println(maxContestant + " " + maxGrade);
    }
}
