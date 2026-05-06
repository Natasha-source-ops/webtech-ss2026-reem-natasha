package htw.webtech.pickmymovie.service;

import htw.webtech.pickmymovie.Repository.WatchListEntryRepository;
import htw.webtech.pickmymovie.model.WatchlistEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WatchlistService {
    @Autowired
    private WatchListEntryRepository watchListEntryRepository;

    public void addToWatchlist(long userId, long movieId) {
        WatchlistEntry entry = new WatchlistEntry();
        entry.setUserId(userId);
        entry.setMovieId(movieId);
        entry.setAddedDate(LocalDate.now());
        watchListEntryRepository.save(entry);
    }

    public void removeFromWatchlist(long userId, long movieId) {
        watchListEntryRepository.deleteByUserIdAndMovieId(userId, movieId);
    }

    public List<WatchlistEntry> getWatchlist(long userId) {
     return watchListEntryRepository.findByUserId(userId);
    }
}


