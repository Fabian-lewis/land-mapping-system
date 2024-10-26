package com.landmapping.land_mapping_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LandController {
    @GetMapping("/hello")
    public String hello(){
        return "redirect:index.html";
    }
}
