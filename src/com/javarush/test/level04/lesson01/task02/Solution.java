package com.javarush.test.level04.lesson01.task02;

/* Реализовать метод addPrice
Реализовать метод addPrice(int applesPrice), чтобы при его вызове суммарная стоимость яблок увеличивалось на переданное значение.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
*/
public class Solution
{
    public static void main(String[] args) {
        Apple apple = new Apple();
        //System.out.println("This static: " + Apple.applesPrice);
        Apple.addPrice(50);
       // System.out.println("This static2: " + Apple.applesPrice);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
       // System.out.println("This static3: " + Apple.applesPrice);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple{
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice){

           int apples;
            apples = applesPrice + Apple.applesPrice;
            Apple.applesPrice = apples;


/*            Apple.applesPrice += applesPrice;*/ // второй вариант
        }
    }
}
