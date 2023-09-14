package com.example.springbasics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        // Application manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        // RecommenderImplementation injects dependency using constructor
        System.out.println("Calling getBean() on RecommenderImplementation");
        RecommenderImplementation movieRecommender = appContext.getBean(RecommenderImplementation.class);

        // call method to get recommendations
        String[] recommendedMovies = movieRecommender.recommendMovies("Finding Dory");

        // display results
        System.out.println(Arrays.toString(recommendedMovies));
    }
}
