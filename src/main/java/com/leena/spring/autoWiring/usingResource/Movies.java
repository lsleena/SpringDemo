package com.leena.spring.autoWiring.usingResource;

public class Movies implements IMovies {

    @Override
    public void printRatings() {

        System.out.println("MOvies has 5 star.");
    }
}
