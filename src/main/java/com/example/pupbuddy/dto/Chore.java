package com.example.pupbuddy.dto;

import lombok.Data;

@Data
public class Chore {
    private int choreId;
    private String choreName;
    private boolean choreComplete;
    private String choreStart;
    private String choreEnd;
    private String dogId;
    private String humanId;
}
