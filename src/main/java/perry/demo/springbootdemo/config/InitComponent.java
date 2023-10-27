package perry.demo.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class InitComponent {

    @Bean
    public MyService myService(){
        MyService myService = new MyService();
        myService.setName("test");
        return myService;
    }

}

