package com.study.javagram;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.text.ParseException;
//import jakarta.validation.constraints.Past;
//import javax.validation.constraints.NotBlank;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name is too short")
    private String firstName;
    
    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 2, message = "Last name is too short")
    private String lastName;

    @NotBlank(message = "User name cannot be blank")
    @Size(min = 7, message = "User name is too short")
    private String userName;

    @Email(message = "Email is not typed correctly")
    private String email;

    //@Past(message = "The date selected must be in the past")
    //private Date dateOfBirth;
    private String dateOfBirth;


    //public String getDateOfBirthAsString() {
        // Convert the Date object to the desired string format
       //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //return sdf.format(dateOfBirth);
    //}

    //Generate a complete constructor.
    public User(String firstName, String lastName, String userName, String email, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    //Generate an empty constructor.
    public User() {
    }

    //Generate getters and setters.
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //public Date getDateOfBirth() {
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    //public void setDateOfBirth(Date dateOfBirth) {
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}

