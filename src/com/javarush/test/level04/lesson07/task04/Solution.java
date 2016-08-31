package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        System.out.println("количество отрицательных чисел: " + (countingNegative(firstNumber) + countingNegative(secondNumber) + countingNegative(thirdNumber)));
        System.out.println("количество положительных чисел: " + (countingPositive(firstNumber) + countingPositive(secondNumber) + countingPositive(thirdNumber)));
    }

    public static int countingPositive(int number){
        if (number > 0){
            return 1;
        } else return 0;
}
    public static int countingNegative(int number){
        if (number > 0){
            return 0;
        } else return 1;
    }
}
