package com.example.Tourist.Service;

import com.example.Tourist.Model.Hotel;
import com.example.Tourist.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public List<Hotel> getHotel() {
        return hotelRepository.findAll();
    }
}
