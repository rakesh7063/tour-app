package com.tour.service;

import com.tour.entity.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    public Location addLocation(Location location);
    public Optional<Location> getLocationById(Long id);
    public List<Location> getAllLocations();
    public Location updateLocation(Long id, Location locationDetails);
    public void deleteLocation(Long id);

}
