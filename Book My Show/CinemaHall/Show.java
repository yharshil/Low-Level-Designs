package CinemaHall;

import java.util.Date;
import java.util.List;

import Movie.Movie;

public class Show {

    int showID;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaPlayedAt;
    List<Seat> seats;

}
