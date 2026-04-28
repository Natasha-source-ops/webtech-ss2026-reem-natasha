package htw.webtech.pickmymovie.Repository;

import htw.webtech.pickmymovie.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
