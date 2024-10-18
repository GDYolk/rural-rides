package mn.localtransport.ruralrides.service;

import mn.localtransport.ruralrides.model.Trip;
import mn.localtransport.ruralrides.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public List<Trip> findAllTrips() {
        return tripRepository.findAll();
    }

    // Бусад методүүд
}