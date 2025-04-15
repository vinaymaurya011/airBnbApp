package com.techboot.projects.airBnbApp.dto;

import com.techboot.projects.airBnbApp.entity.Users;
import com.techboot.projects.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private Users user;
    private String name;
    private Gender gender;
    private Integer age;
}
