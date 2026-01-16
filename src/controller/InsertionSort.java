package controller;

import model.Movie;
import java.util.ArrayList;

public class InsertionSort {

    /*
     Insertion sort algorithm
     Used to sort movies based on movie name
     This works by taking one element at a time
     and placing it in the correct position
    */
    public static void sortByName(ArrayList<Movie> movies) {

        // Loop starts from second element
        for (int i = 1; i < movies.size(); i++) {

            // Current movie to be placed correctly
            Movie current = movies.get(i);

            int j = i - 1;

            /*
             Moving movies that are greater than current
             one position ahead to make space
            */
            while (j >= 0 &&
                   movies.get(j).getName()
                   .compareToIgnoreCase(current.getName()) > 0) {

                movies.set(j + 1, movies.get(j));
                j--;
            }

            // Placing current movie at correct position
            movies.set(j + 1, current);
        }
    }
}
