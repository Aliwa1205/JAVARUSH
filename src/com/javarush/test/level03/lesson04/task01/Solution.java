package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args)
    {

        Date birthDate = new Date(86,00,12);
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(birthDate).toUpperCase());
        //напишите тут ваш код
    }
}

/*    Date date = new Date(95,06,01);
    SimpleDateFormat simpleDate = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
    System.out.println(simpleDate.format(date).toUpperCase());

    В данном случаи класс SimpleDateFormat используем для форматирования даты, причем берем
    Английскую локализацию, потому что по условию должны вывести латинские буквы. Формат "MMM dd yyyy"
    говорит что надо вводить 3х буквенную название месяца, если локализация ENGLISH то будет вам 3х буквенный месяц,
    если локализация Россия то 4х буквенная будет. Далее выводим на экран, причем нам надо большие буквы, в данном
    случаи нам помогает метод toUpperCase которое поднимает буквы на верхний регистр. Вот и все. Кстати не забудьте
    импортировать класс Locale для нашей локализации.

    */