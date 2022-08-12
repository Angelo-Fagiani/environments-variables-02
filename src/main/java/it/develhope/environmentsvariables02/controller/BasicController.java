package it.develhope.environmentsvariables02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @Autowired
    Environment environment;

    @GetMapping(value = "/")
    public String getMessProd(){
        String var1 = environment.getProperty("myCustomProper.welcomeMsg");
        return var1;
    }

}
