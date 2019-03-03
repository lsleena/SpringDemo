package com.leena.spring.dependency.circular;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ratings {

    private Movies objMovies;

    @Autowired
    Ratings (Movies objMovies) {

        this.objMovies = objMovies;
    }

}
