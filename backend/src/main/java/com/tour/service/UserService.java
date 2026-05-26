package com.tour.service;

import com.tour.entity.Users;
import com.tour.exception.InvalidCredentialsException;
import com.tour.exception.UserNotFoundException;


public interface UserService {
    public void register(Users user);
    public Users login(String email, String password) throws UserNotFoundException, InvalidCredentialsException;

}
