package org.example;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private List<Movie> movies;

    public MovieRepository(){
        movies = new ArrayList<>();
        movies.add(new Movie("Avatar", 150, "Sci-Fi"));
        movies.add(new Movie("Bamse och vulkanön", 109, "Kids"));
        movies.add(new Movie("Black Adam", 159, "Action"));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
