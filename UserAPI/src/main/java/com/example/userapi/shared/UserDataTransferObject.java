package com.example.userapi.shared;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import javax.annotation.processing.Generated;
import java.io.Serial;
import java.io.Serializable;


public class UserDataTransferObject implements Serializable {
        private static final long serialVersionUID = 844565856933593922L;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        //public id:
        private String userId;
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
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getUserId() {
            return userId;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
        public String getEncryptedPassword() {
            return encryptedPassword;
        }
        public void setEncryptedPassword(String encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
        }
}
