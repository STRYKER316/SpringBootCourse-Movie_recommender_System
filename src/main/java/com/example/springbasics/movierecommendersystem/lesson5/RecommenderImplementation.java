package com.example.springbasics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // Autowiring by Name
    @Autowired
    private Filter contentBasedFilter;

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("\n Name of the filter in use: " + contentBasedFilter + "\n");

        String[] movieRecommendations = contentBasedFilter.getRecommendations("Finding Dory");

        return movieRecommendations;
    }
}
