package com.robert.apollotest01.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.robert.apollotest01.bean.ApolloConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public ApolloConfigBean testBean() {
        return new ApolloConfigBean();
    }
}
