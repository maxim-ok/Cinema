package ru.netology.domain;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class CinemaManager {
    private MovieName[] movies = new MovieName[0];

    public CinemaManager(int resultLengthMovies) {
        this.resultLengthMovies = resultLengthMovies;
    }

    private int resultLengthMovies = 10;


    public void addNew(MovieName movie) {
        int length = movies.length + 1;
        MovieName[] tmp = new MovieName[length];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;

    }


    public MovieName[] findAll() {
        return movies;
    }


    public MovieName[] findLast() {
        if (movies.length <= getResultLengthMovies()) {
            resultLengthMovies = movies.length;
        } else {
            resultLengthMovies = getResultLengthMovies();
        }
        MovieName[] result = new MovieName[resultLengthMovies];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;


    }


}
