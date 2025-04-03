package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);
}
