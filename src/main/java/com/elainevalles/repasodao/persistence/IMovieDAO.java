package com.elainevalles.repasodao.persistence;

import com.elainevalles.repasodao.exceptions.PersistenceException;
import com.elainevalles.repasodao.model.Movie;

import java.sql.SQLException;
import java.util.List;

public interface IMovieDAO {

    public void create(Movie movie) throws PersistenceException;
    public Movie read(int id) throws PersistenceException;
    public List<Movie> readAll() throws PersistenceException;
    public void update(Movie movie);
    public void delete(int id);
}
