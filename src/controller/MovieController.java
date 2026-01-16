package controller;

import model.Movie;
import model.MovieManager;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class MovieController {

    private static MovieManager manager = new MovieManager();

    public boolean addMovie(Movie m) {
        return manager.addMovie(m);
    }

    public ArrayList<Movie> readMovie() {
        return manager.readMovie();
    }

    public boolean deleteMovie(int id) {
        return manager.delete(id);
    }

    public boolean updateMovie(Movie movie) {
        return manager.updateMovie(movie);
    }

    public Movie getMovieById(int id) {
        for (Movie m : manager.readMovie()) {
            if (m.getID() == id) {
                return m;
            }
        }
        return null;
    }

    public Queue<Movie> getRecentMovies() {
        return manager.getRecentMovie();
    }

   // MovieController.java
    public ArrayList<Movie> searchMovie(String keyword, String criteria) {
    return manager.searchMovie(keyword, criteria);
    }

    
    
    public Stack<Movie> getDeletedMovies() {
    return manager.getDeletedMovies();
    }
    
    public Movie binarySearchByYear(int year) {
    return manager.binarySearchByYear(year);
    }
    
    /*
    Calls undo delete from MovieManager
    Used by Admin Dashboard
    */
    public boolean undoDelete() {
    return manager.undoDelete();
    }

  

 

}
