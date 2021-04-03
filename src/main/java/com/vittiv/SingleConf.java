package com.vittiv;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CustomBeanDefinitionRegistrar.class)
public class SingleConf {
    @Bean
    public InjectListBPP injectListBPP(){
        return new InjectListBPP();
    }
}
