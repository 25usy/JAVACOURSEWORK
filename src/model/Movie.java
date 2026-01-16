
package model;
public class Movie {
    
   
    private int ID;
    private String name;
    private String genre;
    private int releaseYear;
    private double rating; 
    
    public Movie(int ID, String name, String genre, int releaseYear, double rating)
    {
    this.ID=ID;
    this.name=name;
    this.genre=genre;
    this.releaseYear=releaseYear;
    this.rating=rating; 
    }
    
    
    //all the getter functions 
    public int getID()
    {
        return ID;
    }
    public String getName()
    {
        return name;
    }
      public String getGenre()
    {
        return genre;
    }
       
    public int getYear()
    {
        return releaseYear;
    }
    
    public double getRating()
    {   
        return rating;
    }
    
    // all the setter functions 
    public void setName(String nameInput)
    {
        this.name = nameInput;
    }
    
     public void setGenre(String genreInput)
    {
        this.genre = genreInput;
    }
     
     public void setYear(int yearInput)
     {
         this.releaseYear = yearInput;
     }
     
     public void setRating(double ratingInput)
     {
         this.rating = ratingInput;
     }
     
     private String watchStatus = "Not Watched";

     public String getWatchStatus() 
     {
     return watchStatus;
     }

     public void setWatchStatus(String status) 
     {
     this.watchStatus = status;
     }


}
    

