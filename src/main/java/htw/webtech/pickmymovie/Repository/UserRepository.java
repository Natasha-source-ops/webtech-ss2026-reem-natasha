package htw.webtech.pickmymovie.Repository;

import htw.webtech.pickmymovie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
