package com.elainevalles.repasodao;

import com.elainevalles.repasodao.exceptions.PersistenceException;
import com.elainevalles.repasodao.model.Movie;
import com.elainevalles.repasodao.persistence.IMovieDAO;
import com.elainevalles.repasodao.persistence.MovieDAOFactory;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IMovieDAO movieDAO = MovieDAOFactory.getMovieDAO();
        /*
        Movie elconclave = new Movie(1, "El cónclave", "Desconocido");
        try {
            movieDAO.create(elconclave);
            System.out.println("Registro Creado");
        } catch (PersistenceException sqle) {
            System.err.println(sqle.getMessage());
        }
        */

        try {
            movieDAO.create(elconclave);
            System.out.println("Registro Creado");
        } catch (PersistenceException sqle) {
            System.err.println(sqle.getMessage());
        }

        //Movie peliculaLeida = movieDAO.read(1);
        //System.out.println(peliculaLeida);
    }
}