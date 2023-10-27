package perry.demo.springbootdemo.config;


import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;

@Configuration(proxyBeanMethods = false)
//仅仅当perry.demo.springbootdemo.config.MyService类存在时，该配置类生效
//@ConditionalOnClass(name = "perry.demo.springbootdemo.config.MyService")
//仅仅当perry.demo.springbootdemo.config.MyService类不存在时，该配置类生效
//@ConditionalOnMissingClass(value = "perry.demo.springbootdemo.config.MyService")
//当存在MyService的Bean时，实例化MyConfig
//@ConditionalOnBean(type = "perry.demo.springbootdemo.config.MyService")
//当只存在一个MyService的Bean时，实例化MyConfig
@ConditionalOnSingleCandidate(type = "perry.demo.springbootdemo.config.MyService")
//当不存在MyService的Bean时，实例化MyConfig
//@ConditionalOnMissingBean(type = "perry.demo.springbootdemo.config.MyService")

public class MyConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

//    @Bean
    //存在下述属性，才会实例化Bean
//    @ConditionalOnProperty(name = "mytest",prefix = "perry.demo",havingValue = "ball")
    //Spring MVC情况下生效
//    @ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
//    @ConditionalOnWarDeployment
//    @ConditionalOnNotWarDeployment
    //下述表达式myService.name 代表 InitComponent 类中 myService bean的name属性
//    @ConditionalOnExpression("myService.name eq \"test1\"")
////    @ConditionalOnCloudPlatform()
////    @ConditionalOnJava()
//    @ConditionalOnJndi
//    public DateFormat dateFormat(){
//        return DateFormat.getDateInstance();
//    }
}
