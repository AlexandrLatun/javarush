package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        boolean flag = true;
        while (flag) {
            String input = reader.readLine();
            if(!(input.equals("сумма"))){
                int number = Integer.parseInt(input);
                count = count + number;
                } else {
                System.out.println(count);
                flag = false;
            }
        }
    }
}
