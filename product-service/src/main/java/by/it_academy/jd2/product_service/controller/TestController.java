package by.it_academy.jd2.product_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class TestController {

    @GetMapping
    public String test(){
        return "product-service-test";
    }


    @PostMapping("/create")
    public String create(){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity("http://audit-service:8080/audit", String.class);

        return response.getBody();
    }
}
