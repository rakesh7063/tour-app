package com.tour.exception;

public class InvalidTourDataException extends RuntimeException {
    public InvalidTourDataException(String message) {
        super(message);
    }
}
