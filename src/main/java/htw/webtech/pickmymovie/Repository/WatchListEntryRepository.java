package htw.webtech.pickmymovie.Repository;

import htw.webtech.pickmymovie.model.WatchlistEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchListEntryRepository extends JpaRepository<WatchlistEntry, Long> {
}
