package com.tour.service;

import com.tour.entity.Transport;

import java.util.List;

public interface TransportService {
    public Transport addTransport(Transport transport);
    public Transport getTransportById(Long id);
    public List<Transport> getAllTransports();
    public Transport updateTransport(Long id, Transport transportDetails);
    public void deleteTransport(Long id);
}
