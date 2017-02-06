package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        String var1 = bufferedReader.readLine();
        int a = Integer.parseInt(var1);

        String var2 = bufferedReader.readLine();
        int b = Integer.parseInt(var2);

        String var3 = bufferedReader.readLine();
        int c = Integer.parseInt(var3);

        String var4 = bufferedReader.readLine();
        int d = Integer.parseInt(var4);

        if (a>b && a>c && a>d)
        {
            System.out.println(a);
        }
        else if (b>c && b>d)
        {
            System.out.println(b);
        }
        else if (c>d)
        {
        System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
    }

}
