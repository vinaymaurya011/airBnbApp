package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.HotelDto;
import com.techboot.projects.airBnbApp.dto.HotelSearchRequest;
import com.techboot.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> seachHotels(HotelSearchRequest hotelSearchRequest);
}
