package com.example.springbasics.movierecommendersystem.lesson3;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
//        SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        // passing name of the filter as constructor argument
        RecommenderImplementation movieRecommender = new RecommenderImplementation(new ContentBasedFilter());
//        RecommenderImplementation movieRecommender = new RecommenderImplementation(new CollaborativeFilter());

        // call method to get recommendations
        String[] recommendedMovies = movieRecommender.recommendMovies("Finding Dory");

        // display results
        System.out.println(Arrays.toString(recommendedMovies));
    }
}
