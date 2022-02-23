package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;

public class R1Dzenyuy {
    private static Scanner input = new Scanner(System.in);

    public void inputAllBaseTypes(){
        System.out.print("Enter a string :");
        String c = input.next();
        System.out.printf("You entered : %s\n\n", c);

        System.out.print("Enter a long value: ");
        long l = input.nextLong();
        System.out.printf("You entered : %d\n\n", l);

        System.out.print("Enter a double :");
        double d = input.nextDouble();
        System.out.printf("You entered : %f\n\n", d);

        System.out.print("Enter a float :");
        float f = input.nextFloat();
        System.out.printf("You entered : %f\n\n", f);

        System.out.print("Enter an integer : ");
        int i = input.nextInt();
        System.out.printf("You entered : %d\n\n", i);

        System.out.print("Enter a character : ");
        char c1 = input.next().charAt(0);
        System.out.printf("You entered : %s\n\n", c1);
    }

    // method to check if number is a multiple of the other
    public boolean isMultiple(long m, long n){
    return  m%n==0;
    }

    //method is iseven r14
    public boolean isEven(long a){
        return a%2==0;
    }
}
