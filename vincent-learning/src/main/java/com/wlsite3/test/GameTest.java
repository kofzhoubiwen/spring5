package com.wlsite3.test;

import com.wlsite3.bean.Game;
import com.wlsite3.config.CleanSpringConfig;
import com.wlsite3.service.*;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CleanSpringConfig.class);
        context.refresh();

        IServiceImpl iService = (IServiceImpl) context.getBean("IServiceImpl");
        iService.i();



//        GameService gameService = context.getBean(GameServiceImpl.class);
//        RpgGameService rpgGameService = (RpgGameService) context.getBean("rpgGameService",100);
//        Game game = (Game) context.getBean("gameFactoryService");
//        GameService gameService2 = (GameService) context.getBean("&gameServiceImpl"); // 报错 因为AOP之后类型已经不是GameServiceImpl类型了
//        gameService.play();
    }
}

