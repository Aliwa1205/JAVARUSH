package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Позначениследовательность вводимых данных имеет большое е.

*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        сокращенный вариант BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println("Введите число: ");
        String sage = bufferedReader.readLine();  //читаем строку с клавиатуры
        int iage = Integer.parseInt(sage); //преобразовываем строку в число

//        System.out.println("Введите имя: ");
       String name = bufferedReader.readLine(); //читаем строку с клавиатуры



    System.out.print(name + " захватит мир через " + iage + " лет. Му-ха-ха!");
    }
}