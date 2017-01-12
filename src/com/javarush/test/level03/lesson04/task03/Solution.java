package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

import static com.javarush.test.level03.lesson04.task03.Solution.Zerg.*;

public class Solution
{
    public static void main(String[] args)
    {

        Zerg name_zerg = new Zerg();
        name_zerg.name = "Amigo";
        Zerg name_zerg1 = new Zerg();
        name_zerg.name = "Amigoq";
        Zerg name_zerg2 = new Zerg();
        name_zerg.name = "Amigow";
        Zerg name_zerg3 = new Zerg();
        name_zerg.name = "Amigoe";
        Zerg name_zerg4 = new Zerg();
        name_zerg.name = "Amigor";
        Zerg name_zerg5 = new Zerg();
        name_zerg.name = "Amigot";
        Zerg name_zerg6 = new Zerg();
        name_zerg.name = "Amigoy";
        Zerg name_zerg7 = new Zerg();
        name_zerg.name = "Amigou";
        Zerg name_zerg8 = new Zerg();
        name_zerg.name = "Amigoi";
        Zerg name_zerg9 = new Zerg();
        name_zerg.name = "Amigoo";

        Protos name_protos = new Protos();
        name_protos.name = "Randoma";
        Protos name_protos1 = new Protos();
        name_protos.name = "Randoms";
        Protos name_protos2 = new Protos();
        name_protos.name = "Randomd";
        Protos name_protos3 = new Protos();
        name_protos.name = "Randomf";
        Protos name_protos4 = new Protos();
        name_protos.name = "Randomg";

        Terran name_terran = new Terran();
        name_terran.name = "Zebraz";
        Terran name_terran1 = new Terran();
        name_terran.name = "Zebrax";
        Terran name_terran2 = new Terran();
        name_terran.name = "Zebrac";
        Terran name_terran3 = new Terran();
        name_terran.name = "Zebrav";
        Terran name_terran4 = new Terran();
        name_terran.name = "Zebrab";
        Terran name_terran5 = new Terran();
        name_terran.name = "Zebran";
        Terran name_terran6 = new Terran();
        name_terran.name = "Zebram";
        Terran name_terran7 = new Terran();
        name_terran.name = "Zebraa";
        Terran name_terran8 = new Terran();
        name_terran.name = "Zebras";
        Terran name_terran9 = new Terran();
        name_terran.name = "Zebrad";
        Terran name_terran10 = new Terran();
        name_terran.name = "Zebraf";
        Terran name_terran11 = new Terran();
        name_terran.name = "Zebrag";
    }
       /* int i;

        for (i=1; i<=10; i++)
        {
            Zerg name_zerg = new Zerg();
            name_zerg.name = "Amigo"+i;
            System.out.println(name_zerg.name);
        }

        System.out.println();

        int y;

        for (y=1; y<=5; y++)
        {
            Protos name_protos = new Protos();
            name_protos.name = "Random"+y;
            System.out.println(name_protos.name);
        }

        System.out.println();

        int x;

        for (x=1; x<=12; x++)
        {
            Terran name_terran = new Terran();
            name_terran.name = "Zebra"+x;
            System.out.println(name_terran.name);
        }*/


    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}