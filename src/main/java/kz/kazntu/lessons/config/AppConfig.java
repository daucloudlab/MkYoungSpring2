package kz.kazntu.lessons.config;

import kz.kazntu.lessons.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld createHelloWorldBean(){
        HelloWorld hw = new HelloWorld() ;
        hw.setName("Daulet");
        return  hw ;
    }
}
