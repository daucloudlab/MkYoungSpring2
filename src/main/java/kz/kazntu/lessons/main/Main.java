package kz.kazntu.lessons.main;


import kz.kazntu.lessons.beans.HelloWorld;
import kz.kazntu.lessons.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloBean") ;
        helloWorld.printHello();
    }
}
