package Movie;

import java.util.Date;
import java.util.List;
import java.util.Map;

import CinemaHall.Show;

public class Movie {
    
    int movieID;
    String movieName;
    int durationInMins;
    String language;
    Genre genre;
    Date releaseDate;
    Map<String, List<Show>> cityShowMap;

}
