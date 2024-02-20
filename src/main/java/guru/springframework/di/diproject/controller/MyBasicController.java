package guru.springframework.di.diproject.controller;

import guru.springframework.di.diproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Controller
public class MyBasicController {

    private final GreetingService myGreetingService;

    public MyBasicController(@Qualifier("basicService") GreetingService myGreetingService) {
        this.myGreetingService = myGreetingService;
    }

    public String sayHi(){
        return  myGreetingService.getGreeting();
    }
}
