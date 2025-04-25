package com.elainevalles.repasodao.persistence;

public interface MovieDAOFactory {
    public static IMovieDAO getMovieDAO() {
        return new MovieDAOImplFake();

    }
}
