package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int fourthNumber = scanner.nextByte();

        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber){
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber){
            System.out.println(secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > firstNumber){
            System.out.println(thirdNumber);
        } else {
            System.out.println(fourthNumber);
        }

    }
}
