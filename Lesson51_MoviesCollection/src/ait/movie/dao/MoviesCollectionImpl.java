package ait.movie.dao;

import ait.movie.model.Movie;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MoviesCollectionImpl implements MoviseCollection, Iterable<Movie>{
    Set<Movie> movies;

    public MoviesCollectionImpl(Set<Movie> movies) {
        this.movies = new HashSet<>();
    }

    @Override
    public boolean addMovie(Movie movie) {
        return movies.add(movie);
    }

    @Override
    public Movie removeMovie(long imdb) {
        for (Movie movie : movies){
            if (movie.getImdb() == imdb){
                Movie victim = movie;
                movies.remove(movie);
                return victim;
            }
        }
        return null;
    }

    @Override
    public Movie findById(long imdb) {
        return null;
    }

    @Override
    public Iterable<Movie> findByGenge(String genre) {
        return null;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        return null;
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDares(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public int totalQuantity() {
        return 0;
    }

    @Override
    public Iterator<Movie> iterator() {
        return null;
    }
}
