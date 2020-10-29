package com.wlsite.service;

import com.wlsite.dao.Room;
import com.wlsite.util.LogUtil;

public class RoomService {
    public static RoomService createRoom(){
        return new RoomService();
    }
    public void query(){
        LogUtil.info("QUERY", this);
    }
}
