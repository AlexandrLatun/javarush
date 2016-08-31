package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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

      if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == firstNumber){
          System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
      } else if(firstNumber == secondNumber && secondNumber !=thirdNumber && firstNumber != thirdNumber){
          System.out.println(firstNumber + " " + secondNumber);
      } else if(firstNumber == thirdNumber && firstNumber != secondNumber && thirdNumber != secondNumber){
          System.out.println(firstNumber + " " + thirdNumber);
      } else if (secondNumber == thirdNumber && secondNumber != firstNumber && thirdNumber != firstNumber){
          System.out.println(secondNumber + " " + thirdNumber);
      } else {

      }

    }
}