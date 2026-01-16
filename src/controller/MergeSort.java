package controller;

import model.Movie;
import java.util.ArrayList;

public class MergeSort {

    /*
     Merge sort algorithm
     Used to sort movies based on release year
     This uses divide and conquer technique
    */
    public static void sortByYear(ArrayList<Movie> movies) {

        // Base condition
        if (movies.size() <= 1) {
            return;
        }

        // Finding middle index
        int mid = movies.size() / 2;

        // Splitting array list into two parts
        ArrayList<Movie> left = new ArrayList<>(movies.subList(0, mid));
        ArrayList<Movie> right = new ArrayList<>(movies.subList(mid, movies.size()));

        // Recursively sorting both halves
        sortByYear(left);
        sortByYear(right);

        // Merging the sorted halves
        merge(movies, left, right);
    }

    /*
     Helper method to merge two sorted lists
     This compares release year of movies
    */
    private static void merge(ArrayList<Movie> movies,
                              ArrayList<Movie> left,
                              ArrayList<Movie> right) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Comparing both lists and merging
        while (i < left.size() && j < right.size()) {

            if (left.get(i).getYear() <= right.get(j).getYear()) {
                movies.set(k, left.get(i));
                i++;
            } else {
                movies.set(k, right.get(j));
                j++;
            }
            k++;
        }

        // Copying remaining elements from left list
        while (i < left.size()) {
            movies.set(k, left.get(i));
            i++;
            k++;
        }

        // Copying remaining elements from right list
        while (j < right.size()) {
            movies.set(k, right.get(j));
            j++;
            k++;
        }
    }
}
