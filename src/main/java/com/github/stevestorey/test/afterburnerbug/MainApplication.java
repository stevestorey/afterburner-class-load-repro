package com.github.stevestorey.test.afterburnerbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MainApplication {

    @PostMapping("/echo")
    @ResponseBody
    public MyDataObject echo(MyDataObject o) {
        return o;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
