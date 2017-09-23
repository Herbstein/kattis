package com.herbstein.kornislav;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class kornislav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sides = new ArrayList<>();

        sides.add(scanner.nextInt());
        sides.add(scanner.nextInt());
        sides.add(scanner.nextInt());
        sides.add(scanner.nextInt());

        sides.sort(Comparator.comparingInt(n -> n));

        System.out.println(sides.get(2)*sides.get(0));
    }
}
