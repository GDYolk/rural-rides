package mn.localtransport.ruralrides.controller;

import mn.localtransport.ruralrides.model.Trip;
import mn.localtransport.ruralrides.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping
    public List<Trip> getTrips() {
        return tripService.findAllTrips();
    }

    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }

    @GetMapping("/{id}")
    public Trip getTrip(@PathVariable Long id) {
        return tripService.findAllTrips().stream()
                .filter(trip -> trip.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Бусад контроллерын методүүд
}