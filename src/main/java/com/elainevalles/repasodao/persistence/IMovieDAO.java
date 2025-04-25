package com.elainevalles.repasodao.persistence;

import com.elainevalles.repasodao.model.Movie;

import java.util.List;

public interface IMovieDAO {

    public void create(Movie movie);
    public Movie read(int id);
    public List<Movie> readAll();
    public void update(Movie movie);
    public void delete(int id);
}
