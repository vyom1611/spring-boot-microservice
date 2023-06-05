package com.example.userapi.services;

import com.example.userapi.data.UserDataTransferObjectRepository;
import com.example.userapi.data.UserEntity;
import com.example.userapi.models.CreateUserResponseModel;
import com.example.userapi.shared.UserDataTransferObject;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements IUserService {

    UserDataTransferObjectRepository userRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserDataTransferObjectRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }



    @Override
    public UserDataTransferObject createUser(UserDataTransferObject userDetails) {
        // TODO
        userDetails.setUserId(String.valueOf(UUID.randomUUID()));
        userDetails.setEncryptedPassword(bCryptPasswordEncoder.encode(userDetails.getPassword()));

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);

        userRepository.save(userEntity);

        return modelMapper.map(userEntity, UserDataTransferObject.class);

    }
}
