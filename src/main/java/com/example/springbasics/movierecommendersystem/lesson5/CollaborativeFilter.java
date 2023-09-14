package com.example.springbasics.movierecommendersystem.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Auto-wiring by Type with @Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        // implement logic of collaborative filter

        // return movie recommendations
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
