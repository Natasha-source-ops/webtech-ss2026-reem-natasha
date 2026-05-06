package htw.webtech.pickmymovie.service;

import htw.webtech.pickmymovie.controller.dto.MovieRequest;
import htw.webtech.pickmymovie.model.TmdbMovie;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    public List<TmdbMovie> getAllMovies() {
        return List.of(
                new TmdbMovie(1L, "Inception", "A thriller", "2010-07-16", "/inception.jpg"),
                new TmdbMovie(2L,"The Notebook","Romance", "2010-07-16", "/notebook.jpg"),
                new TmdbMovie(3L,"The Dark Knight","Action", "2008-07-16", "/darkknight.jpg")
        );


    }
}