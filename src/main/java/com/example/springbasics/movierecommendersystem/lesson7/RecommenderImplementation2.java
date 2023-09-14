package com.example.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;

    // Setter injection
    @Autowired
    @Qualifier("CF2")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }

    // use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        // print the name of interface implementation being used
        System.out.println("\n Name of the filter in use: " + filter + "\n");

        String[] movieRecommendations = filter.getRecommendations("Finding Dory");

        return movieRecommendations;
    }
}
