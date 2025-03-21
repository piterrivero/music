package com.music.music.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Music implements Serializable {

    private int id;
    private String band;
    private String discTitle;

}
