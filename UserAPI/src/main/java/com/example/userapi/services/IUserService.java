package com.example.userapi.services;

import com.example.userapi.shared.UserDataTransferObject;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    UserDataTransferObject createUser(UserDataTransferObject userDetails);
    UserDataTransferObject getUserDetailsByEmail(String email);
}
