package ait.movie.dao;

import ait.movie.model.Movie;

import java.time.LocalDate;

public interface MoviseCollection {
    boolean addMovie(Movie movie);
    Movie removeMovie(long imdb);
    Movie findById(long imdb);
    Iterable<Movie> findByGenge(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDares(LocalDate from, LocalDate to);
    int totalQuantity();

}
