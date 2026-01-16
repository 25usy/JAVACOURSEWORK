package controller;

import model.Movie;
import model.WatchlistManager;
import java.util.ArrayList;

public class WatchlistController {

    public boolean addToWatchlist(Movie movie) {
        return WatchlistManager.addMovie(movie);
    }

    public ArrayList<Movie> getWatchlist() {
        return WatchlistManager.getWatchlist();
    }

    public boolean updateWatchStatus(int movieId, String status) {
        return WatchlistManager.updateStatus(movieId, status);
    }
}
