package com.herbstein.speedlimit;

import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n < 1) {
                continue;
            }

            int prevTime = 0;
            int totalDistance = 0;
            for (int i = 0; i < n; i++) {
                int speed = scanner.nextInt();
                int newTotalTime = scanner.nextInt();
                int time = newTotalTime - prevTime;
                prevTime = newTotalTime;

                totalDistance += (speed * time);
            }

            System.out.println(totalDistance + " miles");
        }
    }
}
