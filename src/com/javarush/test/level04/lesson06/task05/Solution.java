package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String age = reader.readLine();

        int ageInt = Integer.parseInt(age);

        if(ageInt < 18){
            System.out.println("Подрасти еще");
        }

    }
}