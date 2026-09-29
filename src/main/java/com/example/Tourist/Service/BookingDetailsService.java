package com.example.Tourist.Service;

import com.example.Tourist.Model.BookingDetails;
import com.example.Tourist.Repository.BookingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingDetailsService {

    @Autowired
    BookingDetailsRepository bookingDetailsRepository;


    public List<BookingDetails> getBookingDetails() {
        return bookingDetailsRepository.findAll();
    }


    public String addBookingDetails(String customerName, String hotelName, String checkinDate,String checkoutDate) {
        BookingDetails bookingDetails = new BookingDetails(customerName,hotelName,checkinDate,checkoutDate);
        bookingDetailsRepository.save(bookingDetails);
        return "Room Booked Successfully.";
    }
}
