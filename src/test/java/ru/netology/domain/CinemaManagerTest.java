package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CinemaManagerTest {

    MovieName film1 = new MovieName("Бладшот");
    MovieName film2 = new MovieName("Вперед");
    MovieName film3 = new MovieName("Отель 'Белград'");
    MovieName film4 = new MovieName("Джентельмены");
    MovieName film5 = new MovieName("Человек-невидимка");
    MovieName film6 = new MovieName("Тролли. Мировой тур");
    MovieName film7 = new MovieName("Номер один");

    @Test
    public void addingAndFindTest() {
        CinemaManager manager = new CinemaManager();

        manager.addNew(film1);
        manager.addNew(film2);
        manager.addNew(film3);
        manager.addNew(film4);
        manager.addNew(film5);
        manager.addNew(film6);
        manager.addNew(film7);

        MovieName[] actual = manager.findAll();
        MovieName[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addingAndLimitFindTest() {
        CinemaManager manager = new CinemaManager(3);

        manager.addNew(film1);
        manager.addNew(film2);
        manager.addNew(film3);
        manager.addNew(film4);
        manager.addNew(film5);
        manager.addNew(film6);
        manager.addNew(film7);

        MovieName[] actual = manager.findLast();
        MovieName[] expected = {film7, film6, film5};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void reversTest() {

        CinemaManager manager = new CinemaManager();

        manager.addNew(film1);
        manager.addNew(film2);
        manager.addNew(film3);
        manager.addNew(film4);
        manager.addNew(film5);
        manager.addNew(film6);
        manager.addNew(film7);

        MovieName[] actual = manager.findLast();
        MovieName[] expected = {film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);



    }


}
