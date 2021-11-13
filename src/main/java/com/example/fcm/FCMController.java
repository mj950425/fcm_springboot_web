package com.example.fcm;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class FCMController {

    private final FirebaseInit init;
    @GetMapping("/v1")
    public String v1(){
        init.init();
        return "test";
    }
}