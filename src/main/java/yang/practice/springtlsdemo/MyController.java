package yang.practice.springtlsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello world123sert";
    }
}
