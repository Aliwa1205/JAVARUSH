package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        int aa = Integer.parseInt(a);
       //System.out.println(aa);


        if (aa>=0)
            aa = aa*2;
        else
            aa++;

        System.out.println(aa);


    }

}