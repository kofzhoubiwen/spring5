package com.wlsite3.bean;

import org.springframework.stereotype.Component;

@Component
public class RpgGame {
    private String gameType = "RPG";

    public String getGameType() {
        return gameType;
    }
}
