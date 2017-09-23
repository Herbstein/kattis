package com.herbstein.everywhere;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class everywhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();

            HashMap<String, Integer> cityCount = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String city = scanner.next();
                cityCount.put(city, cityCount.getOrDefault(city, 1));
            }

            System.out.println(cityCount.keySet().size());
        }
    }
}
