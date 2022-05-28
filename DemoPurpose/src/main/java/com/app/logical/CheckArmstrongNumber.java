package com.app.logical;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        //int number = 153;
        String stringNumber="153";
        int number=Integer.valueOf(stringNumber);
        int output = checkArmstrong(number);
            if (output == number) {
                System.out.println("This is a armstrong number " + number);
            } else {
                System.out.println("This is not a armstrong number " + number);
            }
        }

    private static int checkArmstrong(int number) {
        int input = number;
        int rem = 0;
        int output = 0;
        while (input > 0) {
            rem = input % 10;
            output = output + rem * rem * rem;
            input = input / 10;
        }
        return output;
    }
}
