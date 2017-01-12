package com.javarush.test.level03.lesson05.task03;

/* Конвертер времениur
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{
    public static int convertToSeconds(int hour)
    {
     /* int sek = hour *60*60;*/

        return hour*60*60;
    }


    public static void main(String[] args) {

        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(6));

        /*int r = convertToSeconds(5);
        System.out.println(r);

        int r1 = convertToSeconds(7);
        System.out.println(r1);
        //напишите тут ваш код*/
    }
}