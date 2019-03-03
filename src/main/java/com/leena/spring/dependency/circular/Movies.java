package com.leena.spring.dependency.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movies {

    private Ratings objRatings;

    @Autowired
    Movies (Ratings objRatings) {

        this.objRatings = objRatings;
    }

}
