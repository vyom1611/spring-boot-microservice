package com.example.userapi.models;

import com.example.userapi.data.UserEntity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
