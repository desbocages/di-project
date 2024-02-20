package guru.springframework.di.diproject.controller;

import guru.springframework.di.diproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyMiddleController {
    private final GreetingService service;

    public MyMiddleController(@Qualifier("middleService") GreetingService service) {
        this.service = service;
    }

    public String sayHi(){
        return  service.getGreeting();
    }
}
