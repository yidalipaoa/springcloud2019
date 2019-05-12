package com.hansai.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/3/1
 * @time: 上午9:50
 */
@Configuration
@MapperScan("com.hansai.springcloud.mapper")
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return  new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }

}
