package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else if (secondNumber > thirdNumber && thirdNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
        } else if (thirdNumber > firstNumber && firstNumber > secondNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
        } else if (firstNumber > thirdNumber && thirdNumber > secondNumber && firstNumber > secondNumber){
            System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
        } else if (secondNumber > firstNumber && firstNumber > thirdNumber && secondNumber > firstNumber){
            System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
        } else if (thirdNumber > secondNumber && secondNumber > firstNumber && thirdNumber > firstNumber){
            System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
        } else {}

    }
}
