package com.hero.project.client.autoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hero.project.client.impl.SupermanService;
import com.hero.project.client.impl.SupermanServiceImpl;

/**
 * TODO 类描述
 *
 * @author hezun
 */
@Configuration
public class SupermanClientAutoConfig {

    @Bean
    public SupermanService supermanService() {
        return new SupermanServiceImpl();
    }
}
