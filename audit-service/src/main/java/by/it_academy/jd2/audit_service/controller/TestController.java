package by.it_academy.jd2.audit_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class TestController {

    @GetMapping
    public String test(){
        return "audit-service-test";
    }
}
