package guru.springframework.di.diproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ControllersTest {
    @Autowired
    MyBasicController basicController;
    @Autowired
    MyMiddleController middleController;

    @Test
    void testBasicController(){
        assertEquals("Greeting from the interface!", basicController.sayHi());
    }

    @Test
    void testMiddleController(){
        assertEquals("Saying Hi from the primary greeting service!", middleController.sayHi());
    }
}
