package app.model;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "I am a Cat";
    }
}
