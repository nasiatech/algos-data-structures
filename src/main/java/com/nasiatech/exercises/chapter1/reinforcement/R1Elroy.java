package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;

/**
 * @author Elroy Kanye
 */
public class R1Elroy {
    private final Scanner scanner = new Scanner(System.in);
    public int add(int a, int b) {
        return a + b;
    }

    public void r1InputAllBaseTypes() {
        System.out.println("Enter byte");
        byte byteVal = scanner.nextByte();

        System.out.println("Enter int");
        int intVal = scanner.nextInt();

        System.out.println("Enter long");
        long longVal = scanner.nextLong();

        System.out.println("Enter double");
        double doubleVal = scanner.nextDouble();

        System.out.println("Enter char");
        char charVal = scanner.nextLine().toCharArray()[0];
    }

    public boolean r3IsMultiple(long n, long m) {
        if (m == 0) return false;
        return n % m == 0;
    }

    public boolean r4IsEven(int i) {
        boolean flag = false;
        for(int a = 0; a <= i; a++) {
            flag = !flag;
        }
        return flag;
    }
}
