package com.sanismail.movieweb.dto;


import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {
    private Integer id;
    private String name;
    private Date dateBirth;
    private String sex;
}
