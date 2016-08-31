package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        if(userNumber>0){
            userNumber = userNumber * 2;
        } else {
            userNumber = userNumber + 1;
        }

        System.out.println(userNumber);

    }

}