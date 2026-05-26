package com.tour.service;

import com.tour.entity.Booking;
import com.tour.entity.Tour;
import com.tour.entity.Users;

import java.util.List;
import java.util.Map;

public interface BookingService {
    public Booking createBooking(Users customer, Long tourId, int numberOfTickets);
    public Booking confirmBooking(Long bookingId, String paymentIntent);
    public List<Map<String, Object>> getTicketSummaryPerTour();
    public Map<String, Object> getTourDetailsWithBookings(Long tourId);
    public List<Tour> filterTours(String country, String lodgingType, String transportType, Double minPrice, Double maxPrice) ;
    public void deleteBookingsByTourId(Long tourId);
}
