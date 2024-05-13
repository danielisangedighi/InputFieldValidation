package com.study.javagram;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {

    @GetMapping("/")
    public String getForm(Model model) {
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }

    

    
}
