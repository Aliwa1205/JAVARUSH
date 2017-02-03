package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String var = bufferedReader.readLine();
        int a = Integer.parseInt(var);
        //System.out.println(a);

        String[] name = {"понедельник", "вторник", "среда", "четверг", "пятница", "пятница", "суббота", "воскресенье"};

        if (a<=0 || a>=8)
            System.out.println("такого дня недели не существует");
        else
            System.out.println(name[a-1]);

    }

}