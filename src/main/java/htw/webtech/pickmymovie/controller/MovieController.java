package htw.webtech.pickmymovie.controller;

import htw.webtech.pickmymovie.controller.dto.MovieRequest;
import htw.webtech.pickmymovie.model.TmdbMovie;
import htw.webtech.pickmymovie.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {

        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<TmdbMovie>> getMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());

    }
}


