package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        countingPositive(userNumber);
        countingPositive(secondNumber);
        countingPositive(thirdNumber);

        System.out.println(countingPositive(userNumber)+countingPositive(secondNumber)+countingPositive(thirdNumber));

    }

    public static int countingPositive(int number){
        if (number > 0){
            return 1;
        } else return 0;
    }
}
