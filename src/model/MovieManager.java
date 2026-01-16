package model;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class MovieManager {
    
        /*Declaring an Arraylist called movies
        of datatype Movie. 
        */
        private ArrayList<Movie> movies; 
        private Queue<Movie> recentMovies; 
        private Stack<Movie> undoDelete;
        
        /*Initializing the 
        arraylist :)
        */
        public MovieManager()
        {
            movies = new ArrayList<>();
            recentMovies = new LinkedList<>(); //queue is an interface but LinkedList implements Queue
            undoDelete = new Stack<>();
            
            // Pre-existing movies (for coursework demonstration)
            // Using addMovie so queue logic also works
            addMovie(new Movie(1, "Inception", "Sci-Fi", 2010, 8.8));
            addMovie(new Movie(2, "Interstellar", "Sci-Fi", 2014, 8.6));
            addMovie(new Movie(3, "The Dark Knight", "Action", 2008, 9.0));
            addMovie(new Movie(4, "Parasite", "Thriller", 2019, 8.5));
            addMovie(new Movie(5, "Spirited Away", "Animation", 2001, 8.6));
        }
        
        /*Method to add movie
        to the list and also checking for duplicate id
        and sending confirmation.
        */
        public boolean addMovie(Movie movieInput) //here movieInput is a user input which contains (id,name,genre,yearReleased,rating)

        {
            for(int i=0; i<= movies.size()-1; i++) //looping through array list here.
                
            {
                /*checking if the ids are same for movies(storage) and movieInput
                also the getID is a getter function present in Movie class
                 */
                if(movies.get(i).getID() == movieInput.getID()) 
                {
                    return false;
                }
            }
            movies.add(movieInput);
            
            recentMovies.add(movieInput); //usage of Queue FIFO for storing 5 recently added movies
            if (recentMovies.size() > 5) 
            {
              recentMovies.remove();
            }          
            return true;
        }
        
        //Used to Display the Movie in our storage
        public ArrayList<Movie> readMovie()
        {
            return movies;
        }
        
        
        //Checks user input and updates the movie also sends a confirmation
        public boolean updateMovie(Movie movieInputU)
        {
            for(int i=0; i<= movies.size()-1; i++)
            {
                if(movies.get(i).getID() == movieInputU.getID()) 
                {
                    movies.set(i, movieInputU );
                    return true;
                }
               
            }
            return false;
        }
        
        //delete method for removing the movie from the array list
        public boolean delete(int id)
        {
            for(int i=0; i<= movies.size()-1; i++)
            {
                if(movies.get(i).getID()== id)
                {
                    undoDelete.push(movies.get(i)); //usage of stack LIFO
                    movies.remove(i);
                    return true;
                }
                
            }
            return false;
        }
        
        
        
        public Queue<Movie> getRecentMovie()
        {
            return recentMovies;
        }
        
        
      
        
        // Restores the most recently deleted movie using Stack (LIFO)
        public boolean undoDelete()
         {
            if (undoDelete.isEmpty())
             {
               return false; // nothing to undo
             }

        Movie restoredMovie = undoDelete.pop();
        movies.add(restoredMovie);
        return true;
         }
     
        
        /*
        Method to return deleted movies stack
        Used to display recently deleted movies in admin dashboard
        */
        public Stack<Movie> getDeletedMovies() {
        return undoDelete;
        }
        
        /*
        Method to search movie using Binary Search
        Works only for Release Year
        */
    public Movie binarySearchByYear(int year) {

    // Creating a copy so original order is not affected
    ArrayList<Movie> list = new ArrayList<>(movies);

    // Sorting the list by year before using binary search
    for (int i = 0; i < list.size() - 1; i++) {
        for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i).getYear() > list.get(j).getYear()) {
                Movie temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
    }

    int low = 0;
    int high = list.size() - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int midYear = list.get(mid).getYear();

        if (midYear == year) {
            return list.get(mid);
        } 
        else if (midYear < year) {
            low = mid + 1;
        } 
        else {
            high = mid - 1;
        }
    }

    return null;
}
    // MovieManager.java
public ArrayList<Movie> searchMovie(String keyword, String criteria) {

    ArrayList<Movie> results = new ArrayList<>();

    for (Movie m : movies) {

        if (criteria.equals("Movie Name")) {
            if (m.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(m);
            }
        } 
        else if (criteria.equals("Release Year")) {
            if (String.valueOf(m.getYear()).equals(keyword)) {
                results.add(m);
            }
        }
    }

    return results;
}




        
        
        
}
     

        
        
       
        
        
     
        

