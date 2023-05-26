package com.example.userapi.services;

import com.example.userapi.shared.UserDataTransferObject;

public interface IUserService {
    UserDataTransferObject createUser(UserDataTransferObject userDetails);
}
