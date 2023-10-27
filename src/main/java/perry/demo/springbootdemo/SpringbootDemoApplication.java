package perry.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		//获取MyConfig对应的配置类
		System.out.println(ctx.getBean("myConfig"));
		System.out.println(ctx.getBean("myBean"));
	}

}
