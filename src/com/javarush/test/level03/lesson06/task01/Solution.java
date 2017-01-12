package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {

        String name1 = "Мама";
        String name2 = "Мыла";
        String name3 = "Раму";

        System.out.println(name1+name2+name3);
        System.out.println(name1+name3+name2);
        System.out.println(name2+name3+name1);
        System.out.println(name3+name2+name1);
        System.out.println(name2+name1+name3);
        System.out.println(name3+name1+name2);
        //напишите тут ваш код

    }
}