package com.example.Tourist.Controller;

import com.example.Tourist.Model.Hotel;
import com.example.Tourist.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/hotel")
    public List<Hotel> getHotel(){
        return hotelService.getHotel();
    }

}
