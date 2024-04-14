package com.mateuszproszowski.runners;

import org.springframework.stereotype.Component;
@Component//spirng jeśli będzie potrzebował znajdzie @Component i utworzy jego instancję
public class WelcomeMessage {
    public String getMessage(){
        return "Welcome to the Spring Boot!";
    }
}
