package com.RPH.SBMSEurekaClientGreetAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeRestController {

    @GetMapping("/greet")
    public String getGreetMSG(){
        return "Good morning..";
    }

}
