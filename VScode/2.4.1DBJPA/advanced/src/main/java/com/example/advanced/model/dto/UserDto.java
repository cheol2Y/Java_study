package com.example.advanced.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private String userName;
    private int userAge;

    // Getter, Setter, Constructors 등 필요한 메서드 구현
}
