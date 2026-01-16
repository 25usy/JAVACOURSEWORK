package controller;

import java.util.ArrayList;
import model.Movie;

public class SelectionSort {

    // Sort by Movie ID
    public static void sortById(ArrayList<Movie> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getID() < list.get(minIndex).getID()) {
                    minIndex = j;
                }
            }

            Movie temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Sort by Movie Name
    public static void sortByName(ArrayList<Movie> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getName()
                        .compareToIgnoreCase(list.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }

            Movie temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Sort by Release Year
    public static void sortByYear(ArrayList<Movie> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getYear() < list.get(minIndex).getYear()) {
                    minIndex = j;
                }
            }

            Movie temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Sort by Rating
    public static void sortByRating(ArrayList<Movie> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getRating() < list.get(minIndex).getRating()) {
                    minIndex = j;
                }
            }

            Movie temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
