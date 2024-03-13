package Lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args){
        //1: Launch a spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure the context -@Configuration
        //HellowWorldConfiguration
        //name - @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person2Parameters"));

        System.out.println(context.getBean("address2"));

        //System.out.println(context.getBean(Address.class));
    }
}
