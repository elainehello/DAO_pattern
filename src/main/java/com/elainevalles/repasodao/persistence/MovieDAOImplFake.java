package com.elainevalles.repasodao.persistence;

import com.elainevalles.repasodao.model.Movie;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
//crud pattern
public class MovieDAOImplFake implements IMovieDAO{
    private List<Movie> movies = new ArrayList<Movie>();
    @Override
    public void create(Movie movie) {
        this.movies.add(movie);
    }

    @Override
    public Movie read(int id) {
        return this.movies.stream().filter(movie -> movie.getId()==id).findFirst().get();
    }

    @Override
    public List<Movie> readAll() {
        return this.movies;
    }

    @Override
    public void update(Movie movie) {
        delete(movie.getId());
        this.movies.add(movie);
        //TODO - Pendiente
    }

    @Override
    public void delete(int id) {
        //TODO - Pendiente
        this.movies.removeIf(movie -> movie.getId() == id);
    }
}