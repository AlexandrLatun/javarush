package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = 0;
        do {
            n = Integer.parseInt(reader.readLine());
        } while (n < 0);
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number >= maximum){
                maximum = number;
            }

        }
        System.out.println(maximum);
    }
}
