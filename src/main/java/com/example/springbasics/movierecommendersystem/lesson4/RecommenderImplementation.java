package com.example.springbasics.movierecommendersystem.lesson4;

import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // use filter interface to select filter
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("\n Name of the filter in use: " + filter + "\n");

        String[] movieRecommendations = filter.getRecommendations("Finding Dory");

        return movieRecommendations;
    }
}
