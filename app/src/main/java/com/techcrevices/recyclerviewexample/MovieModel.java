package com.techcrevices.recyclerviewexample;

public class MovieModel {

    String movieName;
    String movieType;
    String movieYear;

    public MovieModel(String movieName, String movieType, String movieYear) {
        this.movieName = movieName;
        this.movieType = movieType;
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public String getMovieYear() {
        return movieYear;
    }
}
