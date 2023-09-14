package com.example.springbasics.movierecommendersystem.lesson7;

import org.springframework.stereotype.Component;

@Component("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        // implement logic of collaborative filter

        // return movie recommendations
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
