package htw.webtech.pickmymovie.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TmdbMovie {
        private Long id;
        private String title;

        @JsonProperty("overview")
        private String description;


        @JsonProperty("release_date")
        private String releaseDate;


        @JsonProperty("poster_path")
        private String imageUrl;
    }

