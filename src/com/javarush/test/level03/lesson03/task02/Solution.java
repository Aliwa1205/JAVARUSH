package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{


    public static void main(String[] args) {


        System.out.println( convertEurToUsd(5, 28.5));
        System.out.println( convertEurToUsd(5, 14));

        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course){
       //В Java есть дробные тип - double

        double res = eur * course;
        return res; // что-то новенькое, т.к. умн. int на double нужно все конвертировть в int т.к. на выходе int
        //напишите тут ваш код

        // return eur * course; // можно просто так таписать вместо двух строчек
        // sout = System.out.println
        // выделить и нажать CTR+D - клонирование
        // ALT+ENTER - подсказка
        // когда идет double - всегда return
    }
}
