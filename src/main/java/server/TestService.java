package server;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestService {

    public String hello() {
        return "Hello!";
    }
}

