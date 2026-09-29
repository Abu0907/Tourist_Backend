package com.example.Tourist.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {

    @Id
    private int hotelId;
    private String name;
    private String location;
    private int rentPerDay;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public Hotel(int hotelId, String name, String location, int rentPerDay) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.rentPerDay = rentPerDay;
    }

    public Hotel() {
    }
}
