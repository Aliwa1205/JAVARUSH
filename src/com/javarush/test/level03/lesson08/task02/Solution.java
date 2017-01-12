package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        String snumb1 = bufferedReader.readLine();
        int inumb1 = Integer.parseInt(snumb1);

        String snumb2 = bufferedReader.readLine();
        int inumb2 = Integer.parseInt(snumb2);

        System.out.println(name + " получает " + inumb1 + " через " + inumb2 + " лет.");
    }
}