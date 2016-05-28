package com.anter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPrimeNumber());
        return;
    }

    private static boolean isPrimeNumber() {
        int number = 300000000;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
