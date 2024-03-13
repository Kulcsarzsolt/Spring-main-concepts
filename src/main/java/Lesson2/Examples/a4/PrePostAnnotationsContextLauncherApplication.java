package Lesson2.Examples.a4;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are injected");
    }

    @PostConstruct
    public void initiliaze() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        someDependency.cleanUp();
    }

}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("I'm ready");
    }

    public void cleanUp() {
        System.out.println("I'm done");
    }

}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (PrePostAnnotationsContextLauncherApplication.class)) {

        }
    }
}
