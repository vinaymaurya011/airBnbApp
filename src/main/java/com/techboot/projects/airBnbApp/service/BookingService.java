package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.BookingDto;
import com.techboot.projects.airBnbApp.dto.BookingRequest;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);
}
