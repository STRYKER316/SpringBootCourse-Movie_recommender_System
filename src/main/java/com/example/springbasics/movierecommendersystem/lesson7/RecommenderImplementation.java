package com.example.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;

    // Constructor Injection
    public RecommenderImplementation(@Qualifier("CBF2") Filter filter) {
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("\n Name of the filter in use: " + filter + "\n");

        String[] movieRecommendations = filter.getRecommendations("Finding Dory");

        return movieRecommendations;
    }
}
