package com.knoldus.Lambda1;


import java.util.*;

public class ReturnOfMaximumMain {
    public static void main(String[] args) {

        // Lambda Expression which returns maximum value.
        ReturnOfMaximumInterface maximumNumber = (number1, number2) -> Math.max(number1,number2);

        Scanner input = new Scanner(System.in);

        // Taking user inputs.
        System.out.println("Enter first Number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter Second Number:");
        int secondNumber = input.nextInt();

        // Here we compare the numbers and return output.
        System.out.println("After Comparing Both Numbers, Maximum Number is :-");
        System.out.println(maximumNumber.maximumNumber(firstNumber,secondNumber));
    }
}
