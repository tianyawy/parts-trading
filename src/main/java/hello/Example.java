package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
