package com.example.userapi.data;

import org.springframework.data.repository.CrudRepository;

public interface UserDataTransferObjectRepository extends CrudRepository<UserEntity, Long> {
}