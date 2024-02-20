package guru.springframework.di.diproject.services;

import org.springframework.stereotype.Service;

@Service("basicService")
public class BasicGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Greeting from the interface!";
    }
}
