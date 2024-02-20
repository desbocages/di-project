package guru.springframework.di.diproject.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service("middleService")
public class MiddleGreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Saying Hi from the primary greeting service!";
    }
}
