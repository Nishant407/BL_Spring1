package com.example.FirstSpringApp.controller;

import com.example.FirstSpringApp.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // POST request
    @PostMapping
    public String sayHelloPost(@RequestBody String name) {
        return "Hello, " + name + " from BridgeLabz";
    }

    // PUT request
    @PutMapping("/{name}")
    public String sayHelloPut(@PathVariable String name) {
        return "Updated Hello, " + name + " from BridgeLabz";
    }

    // DELETE request
    @DeleteMapping("/{name}")
    public String sayHelloDelete(@PathVariable String name) {
        return "Goodbye, " + name + " from BridgeLabz";

    }
    @GetMapping("/query")
    public String sayHelloWithQueryParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
        //http://localhost:8080/hello/query?name=Mark --- to run
    }
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVar(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
        //http://localhost:8080/hello/param/Nishant  ----to run
    }
    @PostMapping("post")
    public String greetWithRequestBody(@RequestBody Message names){
        return "Hello, "+names.getFirstName()+" "+names.getLastName();
    }
    @PutMapping("put/{firstName}")
    public String greetWithQueryAndParam(@RequestParam String lastName,@PathVariable String firstName){
        return "HELLO! "+firstName+" "+lastName;
}
}
