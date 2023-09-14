package com.example.springbasics.movierecommendersystem.lesson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        // Application manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        // Use ApplicationContext to find which filter is being used
        RecommenderImplementation movieRecommender = appContext.getBean(RecommenderImplementation.class);

        // call method to get recommendations
        String[] recommendedMovies = movieRecommender.recommendMovies("Finding Dory");

        // display results
        System.out.println(Arrays.toString(recommendedMovies));
    }
}
