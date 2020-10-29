package com.wlsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/jndi")
public class JNDIController {

    @GetMapping("/lookup")
    @ResponseBody
    public String lookup() throws NamingException {

        Context ctx= new InitialContext();
        ctx.lookup("k1");

        return ctx.toString();

    }

}
