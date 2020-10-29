package com.wlsite3.service;

import com.wlsite3.bean.RpgGame;
import com.wlsite3.bean.SlgGame;
import org.springframework.stereotype.Service;

@Service
public class RpgGameService {

    private String type;
    private String name;
    private double price;

    public RpgGameService(RpgGame rpgGame){
        this.type = rpgGame.getGameType();
    }
//    public RpgGameService(){
//    }
//    public RpgGameService(Integer aa){
//    }
//    public RpgGameService(String bb){
//    }

//    public RpgGameService(String type, String name, double price){
//        this.type = type;
//        this.name = name;
//        this.price = price;
//    }

//    public RpgGameService(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }


}
