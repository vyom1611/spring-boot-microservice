package com.example.userapi.models;

import com.example.userapi.data.UserEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class CreateUserRequestModel {
    @NotNull(message = "First Name cannot be empty")
    @Size(min = 2, message = "First Name cannot be lower than 2 characters")
    private String firstName;
    @NotNull(message = "Last Name cannot be empty")
    @Size(min = 2, message = "First Name cannot be lower than 2 characters")
    private String lastName;
    @NotNull(message = "Email cannot be empty")
    @Email(message = "Not a valid email")
    private String email;
    @NotNull(message = "Password cannot be empty")
    @Size(min = 6, max=18, message = "Password must be within the range 6 and 18")
    private String encryptedPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(firstName, userEntity.getFirstName()) && Objects.equals(lastName, userEntity.getLastName()) && Objects.equals(email, userEntity.getEmail()) && Objects.equals(encryptedPassword, userEntity.getEncryptedPassword());
    }
}