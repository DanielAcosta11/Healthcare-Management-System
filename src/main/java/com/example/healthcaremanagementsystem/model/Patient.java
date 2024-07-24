package com.example.healthcaremanagementsystem.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Annotated entity: patient
@Entity
public class Patient {

    //Auto-incremented and auto-generated ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String email;
    private String address;

    public Patient() {
        //No arg constructor for JPA when retrieving entities from database
    }

    //Constructor
    public Patient(String firstName, String lastName, String gender, LocalDate dateOfBirth, String phoneNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    //getter and setter for ID
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    //getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter and setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter and setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //getter and setter for dateOfBirth
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //getter and setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Overriding object class method toString() to print patient information
    //Patient{} indicates that patient is an object in Java
    @Override
    public String toString() {
        return "Patient{" +
        "id=" + ID +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", gender='" + gender + '\'' +
        ", dateOfBirth='" + dateOfBirth + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        '}';
        }
}
