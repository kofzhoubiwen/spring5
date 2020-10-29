package com.wlsite3.service;

import com.wlsite.service.IndexService;
import com.wlsite.util.LogUtil;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

//    public GameServiceImpl() {
//        LogUtil.info("CONSTRUCTOR", this);
//    }
//    public GameServiceImpl(String gameName) {
//        LogUtil.info("CONSTRUCTOR WITH 1 STRING ARGUMENT", this);
//    }
//    @Autowired
    public GameServiceImpl(PlayerService playerService) {
        playerService.buyGame();
        LogUtil.info("CONSTRUCTOR WITH 1 BEAN ARGUMENT", this);
    }



    @Override
    public void play() {
        LogUtil.info("PLAY", this);
    }

}
