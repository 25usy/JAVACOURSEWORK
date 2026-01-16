package model;

import java.util.ArrayList;

public class WatchlistManager {

    private static ArrayList<Movie> watchlist = new ArrayList<>();

    public static boolean addMovie(Movie movie) {

        // prevent duplicates
        for (int i = 0; i < watchlist.size(); i++) {
            if (watchlist.get(i).getID() == movie.getID()) {
                return false;
            }
        }

        watchlist.add(movie);
        return true;
    }

    public static ArrayList<Movie> getWatchlist() {
        return watchlist;
    }

    public static boolean updateStatus(int movieId, String status) {

        for (int i = 0; i < watchlist.size(); i++) {
            if (watchlist.get(i).getID() == movieId) {
                watchlist.get(i).setWatchStatus(status);
                return true;
            }
        }
        return false;
    }
}
