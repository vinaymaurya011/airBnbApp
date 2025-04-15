package com.techboot.projects.airBnbApp.dto;

import com.techboot.projects.airBnbApp.entity.Hotel;
import com.techboot.projects.airBnbApp.entity.Room;
import com.techboot.projects.airBnbApp.entity.Users;
import com.techboot.projects.airBnbApp.entity.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class BookingDto {
    private Long id;
    private Hotel hotel;
    private Room room;
    private Users user;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
