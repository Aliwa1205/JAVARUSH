package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String val1 = bufferedReader.readLine();
        int a = Integer.parseInt(val1);

        String val2 = bufferedReader.readLine();
        int b = Integer.parseInt(val2);

        if (a<=b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}