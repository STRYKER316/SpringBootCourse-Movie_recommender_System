package com.example.springbasics.movierecommendersystem.lesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //create object of RecommenderImplementation class
        RecommenderImplementation movieRecommender = new RecommenderImplementation();
        //call method to get recommendations
        String[] recommendedMovies = movieRecommender.recommendMovies("Finding Dory");
        //display results
        System.out.println(Arrays.toString(recommendedMovies));
    }
}
