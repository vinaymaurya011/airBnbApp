package com.techboot.projects.airBnbApp.service;

import com.techboot.projects.airBnbApp.dto.RoomDto;
import com.techboot.projects.airBnbApp.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final ModelMapper modelMapper;
    private final RoomRepository roomRepository;


    @Override
    public RoomDto createNewRoom(RoomDto roomDto) {
        return null;
    }

    @Override
    public List<RoomDto> getAllRoomsInHotel(Long hotelId) {
        return List.of();
    }

    @Override
    public RoomDto getRoomById(Long hotelId, Long roomId) {
        return null;
    }

    @Override
    public void deleteHotelById(Long hotelId, Long roomId) {

    }
}
