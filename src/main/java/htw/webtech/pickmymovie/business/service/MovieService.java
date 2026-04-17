package htw.webtech.pickmymovie.business.service;


import htw.webtech.pickmymovie.MovieDTO;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MovieService {

    public List<MovieDTO> getAllMovies() {
        return List.of(
                new MovieDTO("Inception"),
                new MovieDTO("The Notebook"),
                new MovieDTO("The Dark Knight")
        );
    }
}

