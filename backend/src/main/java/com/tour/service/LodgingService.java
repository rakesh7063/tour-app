package com.tour.service;

import com.tour.entity.Lodging;

import java.util.List;

public interface LodgingService {
    public Lodging addLodging(Lodging lodging);
    public Lodging getLodgingById(Long id);
    public List<Lodging> getAllLodgings();
    public Lodging updateLodging(Long id, Lodging lodgingDetails);
    public void deleteLodging(Long id);
}
