package com.herbstein.dicecup;

import java.util.HashMap;
import java.util.Scanner;

public class dicecup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> results = new HashMap<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (results.containsKey(i + j)) {
                    results.put(i + j, results.get(i + j) + 1);
                } else {
                    results.put(i + j, 1);
                }
            }
        }

        int best = 0;
        for (Integer i : results.values()) {
            if (best < i) {
                best = i;
            }
        }

        for (Integer i : results.keySet()) {
            if (results.get(i) == best) {
                System.out.println(i);
            }
        }
    }
}
