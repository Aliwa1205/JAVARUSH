package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String var1 = bufferedReader.readLine();
        int a = Integer.parseInt(var1);

        String var2 = bufferedReader.readLine();
        int b = Integer.parseInt(var2);

        String var3 = bufferedReader.readLine();
        int c = Integer.parseInt(var3);

        int[] arr = {a,b,c};
        Arrays.sort(arr);
        System.out.println(arr[2]+" "+arr[1]+" "+arr[0]);

       /*  1-вариант
       if (a>=b&&b>=c)
        {
            System.out.println(a+" "+b+" "+c);
        }
        else if (b>=a&&a>=c)
        {
            System.out.println(b+" "+a+" "+c);
        }
        else if (a>=c&&c>=b)
        {
            System.out.println(a+" "+c+" "+b);
        }
        else if (b>=c&&c>=a)
        {
            System.out.println(b+" "+c+" "+a);
        }
        else if (c>=a&&a>=b)
        {
            System.out.println(c+" "+a+" "+b);
        }
        else
        {
            System.out.println(c+" "+b+" "+a);
        }*/
    }
}
