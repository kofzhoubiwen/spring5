package com.wlsite3.service;

import com.wlsite.util.LogUtil;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Override
    public void buyGame() {
        LogUtil.info("BUY GAME", this);
    }
}
