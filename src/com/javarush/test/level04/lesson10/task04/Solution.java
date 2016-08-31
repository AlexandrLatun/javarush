package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        int width = 0;
        int height = 0;
        while (height < 10) {

            while (width < 9) {
                System.out.print("S");
                width++;
            }
            width = 0;

            System.out.println("S");
            height++;

        }
    }
}
