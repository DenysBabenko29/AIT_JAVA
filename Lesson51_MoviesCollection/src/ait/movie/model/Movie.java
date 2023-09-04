package ait.movie.model;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
    private long imdb;
    private String title;
    private String director; //
    private String genre; // жанр
    private LocalDate date; // дата выхода фильма

    public Movie(long imdb, String title, String direcor, String genre, LocalDate date) {
        this.imdb = imdb;
        this.title = title;
        this.director = direcor;
        this.genre = genre;
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getImdb() {
        return imdb;
    }

    public String getTitle() {
        return title;
    }

    public String getDirecor() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Model{");
        sb.append("imdb=").append(imdb);
        sb.append(", title='").append(title).append('\'');
        sb.append(", direcor='").append(director).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie model = (Movie) o;
        return imdb == model.imdb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imdb);
    }
}
