package com.example.springbasics.movierecommendersystem.lesson6;

import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        // implement logic of content based filter

        // return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
