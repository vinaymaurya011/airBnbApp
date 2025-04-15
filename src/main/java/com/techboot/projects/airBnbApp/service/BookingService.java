package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.BookingDto;
import com.techboot.projects.airBnbApp.dto.BookingRequest;
import com.techboot.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
