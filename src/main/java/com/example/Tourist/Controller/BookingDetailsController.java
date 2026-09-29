package com.example.Tourist.Controller;

import com.example.Tourist.Model.BookingDetails;
import com.example.Tourist.Service.BookingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SimpleTimeZone;

@CrossOrigin(value = {"http://localhost:5500", "http://127.0.0.1:5500"})
@RestController
public class BookingDetailsController {

    @Autowired
    BookingDetailsService bookingDetailsService;

    @GetMapping("/bookingdetails")
    public List<BookingDetails> getBookingDetails(){
        return bookingDetailsService.getBookingDetails();
    }

    @PostMapping("/bookingdetails/add")
    public String addBookingDetails(@RequestParam("customerName") String customer_name,
                                    @RequestParam("hotelName") String hotel_name,
                                    @RequestParam("checkinDate") String checkin_date,
                                    @RequestParam("checkoutDate") String checkout_date){
        return bookingDetailsService.addBookingDetails(customer_name,hotel_name,checkin_date,checkout_date);
    }


}
