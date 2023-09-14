package com.example.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // Autowiring by Name
    @Autowired
    @Qualifier("CBF")
//    @Qualifier("CF")
    private Filter filter;

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("\n Name of the filter in use: " + filter + "\n");

        String[] movieRecommendations = filter.getRecommendations("Finding Dory");

        return movieRecommendations;
    }
}
