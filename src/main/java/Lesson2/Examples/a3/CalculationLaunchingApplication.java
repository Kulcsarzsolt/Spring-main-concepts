package Lesson2.Examples.a3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CalculationLaunchingApplication {

        public static void main(String[] args) {

            try (var context =
                        new AnnotationConfigApplicationContext
                                (CalculationLaunchingApplication.class)) {

                System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            }
        }
}
