package com.tour.service;

import com.tour.entity.Tour;

import java.util.List;
import java.util.Optional;

public interface TourService {
    public Tour saveTour(Tour tour, Long locationId, Long lodgingId, Long transportId);
    public List<Tour> getAllToursWithDetails();
    public Optional<Tour> getTourById(Long id);
    public void deleteTour(Long id);
    public Tour updateTourWithAssociations(Long tourId, Tour updatedTour);
}
