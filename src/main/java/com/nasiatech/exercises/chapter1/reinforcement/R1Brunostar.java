package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;

public class R1Brunostar {
    public static void main(String args[]) {
//        System.out.println(r17sumOddSq(5));
        System.out.println(r18countVowels("elephant"));
    }

    public int add2Nums ( int a, int b){
        return a + b;
    }

    public void inputAllBaseTypes () {
        int intVal;
        double doubleVal;
        long longVal;
        String stringVal;
        boolean boolVal;
        char charVal;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter an integer value...");
        intVal = myObj.nextInt();
        System.out.println("Your integer is: " + intVal);

        System.out.println("Enter a double value...");
        doubleVal = myObj.nextDouble();
        System.out.println("Your double is: " + doubleVal);

        System.out.println("Enter a long value...");
        longVal = myObj.nextLong();
        System.out.println("Your long is: " + longVal);

        System.out.println("Enter a string value...");
        stringVal = myObj.nextLine();
        System.out.println("Your integer is: " + stringVal);

        System.out.println("Enter a boolean value...");
        boolVal = myObj.nextBoolean();
        System.out.println("Your boolean is: " + boolVal);

        System.out.println("Enter a character value...");
        charVal = (myObj.nextLine()).charAt(0);
        System.out.println("Your character is: " + charVal);
    }

    public boolean isMultiple ( int n, int m){
        return n % m == 0 ? true : false;
    }

    public static boolean isEven(int x){
        int i;
        for (i = 0; i <= x; i += 2) {}
        return i == x + 2? true : false;
    }

    public static int r15sum(int x) {
        return x > 0? x + r15sum(x - 1): 0;
    }

    public static int r16sumOdd(int x) {
        return x > 0? x % 2 != 0? x + r16sumOdd(x - 2):r16sumOdd(x - 1) : 0;
    }

    public static int r17sumOddSq(int x) {
        return x > 0? (int) (x % 2 != 0 ? x*x + r17sumOddSq(x - 2): r17sumOddSq(x - 1)) : 0;
    }

    public static int r18countVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int sum = 0;
        for(int i=0; i<word.length(); i++) {
            char k = word.charAt(i);
            for(int j=0; j<vowels.length; j++){
                sum += vowels[j] == k? 1:0;
            }
        }
        return sum;
    }
}
