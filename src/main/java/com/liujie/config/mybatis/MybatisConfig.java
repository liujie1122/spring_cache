package com.liujie.config.mybatis;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @program: spring_data_mybatis
 * @description:
 * @author: LiuJie
 * @create: 2019-11-20 14:30
 **/
@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
       return new ConfigurationCustomizer() {
           @Override
           public void customize(Configuration configuration) {
               configuration.setMapUnderscoreToCamelCase(true);
           }
       };
    }
}
