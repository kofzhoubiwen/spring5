package com.wlsite3.service;

import com.wlsite3.bean.Game;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

@Service
public class GameFactoryService implements FactoryBean<Game> {

    @Override
    public Game getObject() throws Exception {
        return new Game("G1");
    }

    @Override
    public Class<?> getObjectType() {
        return Game.class;
    }

}
