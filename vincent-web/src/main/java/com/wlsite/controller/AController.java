package com.wlsite.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/a")
public class AController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/map")
    @ResponseBody
    public Map<String, String> map(){
        HashMap<String, String> map = new HashMap<>();
        map.put("1","a");
        return map;
    }


    @RequestMapping("/string")
    @ResponseBody
    public String string(){
        return "String";
    }
}
