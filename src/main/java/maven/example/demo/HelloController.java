package  maven.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. Must be annotated as a RestController
public class HelloController {

    // 2. This method maps to the root path ("/")
    @GetMapping("/") 
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    // You can also add a mapping for /hello
    @GetMapping("/hello")
    public String greetUser() {
        return "Welcome to the Hello page!";
    }
}
