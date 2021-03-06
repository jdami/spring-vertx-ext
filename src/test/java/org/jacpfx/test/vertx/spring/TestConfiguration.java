package org.jacpfx.test.vertx.spring;

import org.jacpfx.test.vertx.spring.factory.InjectionTestService;
import org.jacpfx.test.vertx.spring.factory.SpringTestVerticle;
import org.jacpfx.test.vertx.spring.factory.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jacpfx.test")
public class TestConfiguration {
    @Bean
    public TestService testService() {
        return new TestService();
    }

    @Bean
    public SpringTestVerticle springTestVerticle() {
        return new SpringTestVerticle();
    }

    @Bean
    public InjectionTestService testService2() {
        return new InjectionTestService();
    }

}