package io.github.agbaroni.fuse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Test {

    @RequestMapping("/")
    public String home() {
        return "Ciao!";
    }
}
