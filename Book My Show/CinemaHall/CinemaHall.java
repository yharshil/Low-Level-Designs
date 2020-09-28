package CinemaHall;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import Movie.Movie;


public class CinemaHall {

    int cinemaID;
    String cinemaHallName;
    Address address;
    List<Audi> audiList;

    public Map<Date, Movie> getMovies(List<Date> dateList) {
        return null;
    }
    
    public Map<Date, Show> getShows(List<Date> dateList) {
        return null;
    }

}
