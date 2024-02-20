package guru.springframework.di.diproject.services;

import guru.springframework.di.diproject.controller.MyBasicController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiddleGreetingServiceImplTest {

    @Autowired
    private MyBasicController controller;
    @Test
    void getGreeting() {
        System.out.println(controller.sayHi());
    }
}