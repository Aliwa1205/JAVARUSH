package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

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
        /*int indexOf(ch) — возвращает индекс символа ch в строке (индекс это порядковый номер символа, но нумероваться символы начинают с нуля).*/
        if (a==b)
        {
            System.out.println(3);
        }
        else if (a==c)
        {
            System.out.println(2);
        }
        else if (b==c)
        {
            System.out.println(1);
        }
    }
}
