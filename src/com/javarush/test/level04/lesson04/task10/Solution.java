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

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String var1 = bufferedReader.readLine();
        int a  = Integer.parseInt(var1);

        String var2 = bufferedReader.readLine();
        int b  = Integer.parseInt(var2);

        String var3 = bufferedReader.readLine();
        int c  = Integer.parseInt(var3);

//        System.out.println(a + " " + b + " " + c);

    if (a==b && a==c && b==c)//(a==b&&b==c)
    {System.out.println(a + " " + b + " " + c);}
        else if (a==b)
    {System.out.println(a + " " + b);}
        else if (a==c)
    {System.out.println(a + " " + c);}
        else if (b==c)
    {System.out.println(b + " " + c);}
        else
    {}
    }
}