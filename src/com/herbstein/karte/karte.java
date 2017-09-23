package com.herbstein.karte;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class karte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        HashMap<Character, HashSet<Integer>> suits = new HashMap<>();

        suits.computeIfAbsent('P', k -> new HashSet<>());
        suits.computeIfAbsent('K', k -> new HashSet<>());
        suits.computeIfAbsent('H', k -> new HashSet<>());
        suits.computeIfAbsent('T', k -> new HashSet<>());

        for (int i = 0; i < in.length(); i += 3) {
            char suit = in.charAt(i);
            int num = Integer.parseInt(String.valueOf(in.charAt(i + 1)) + in.charAt(i + 2));

            if (suits.get(suit).contains(num)) {
                System.out.println("GRESKA");
                System.exit(0);
            } else {
                suits.get(suit).add(num);
            }
        }

        System.out.println((13-suits.get('P').size()) + " " + (13-suits.get('K').size()) + " " + (13-suits.get('H').size()) + " " + (13-suits.get('T').size()));
    }
}
