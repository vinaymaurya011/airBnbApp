package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.HotelDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    Boolean deleteHotelById(Long id);

    void activateHotel(Long hotelId);
}
