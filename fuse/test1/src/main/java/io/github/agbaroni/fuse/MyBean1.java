package io.github.agbaroni.fuse;

import org.springframework.stereotype.Component;

@Component
public class MyBean1 {

    public String invoke1(String message) {
	return String.format("=> %s", message);
    }

    public String invoke2() {
	return "Hola!";
    }
}
