package htw.webtech.pickmymovie.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class TmdbResponse {

        private List<TmdbMovie> results;
    }
