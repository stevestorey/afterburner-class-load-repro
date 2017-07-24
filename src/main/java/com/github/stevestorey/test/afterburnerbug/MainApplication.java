package com.github.stevestorey.test.afterburnerbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {

    @PostMapping("/echo")
    @ResponseBody
    public MyDataObject echo(@RequestBody MyDataObject o) {
        return o;
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper om = new ObjectMapper();
        om.findAndRegisterModules();
        return om;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
