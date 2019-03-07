package com.leena.spring.autoWiring.usingResource;

import javax.annotation.Resource;

public class RatingsImpl implements IRatings {

    @Resource(name="movieBean")
    private IMovies ratings;

    public IMovies getRatings() {
        return ratings;
    }

    public void setRatings(IMovies ratings) {
        this.ratings = ratings;
    }

    @Override
    public void rateMovies() {
        System.out.println("Entering rateMovies");
        ratings.printRatings();
    }
}
