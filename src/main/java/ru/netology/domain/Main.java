package ru.netology.domain;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MovieName film1 = new MovieName("Бладшот");
        MovieName film2 = new MovieName("Вперед");
        MovieName film3 = new MovieName("Отель 'Белград'");
        MovieName film4 = new MovieName("Джентельмены");
        MovieName film5 = new MovieName("Человек-невидимка");
        MovieName film6 = new MovieName("Тролли. Мировой тур");
        MovieName film7 = new MovieName("Номер один");


        CinemaManager manager = new CinemaManager(11);
        manager.addNew(film1);
        manager.addNew(film2);
        manager.addNew(film3);
        manager.addNew(film4);
        manager.addNew(film5);
        manager.addNew(film6);
        manager.addNew(film7);

        //manager.findAll();
        //MovieName[] x = manager.findAll();

        manager.findLast();

        MovieName[] x = manager.findLast();


        System.out.println(Arrays.asList(x));


    }


}
