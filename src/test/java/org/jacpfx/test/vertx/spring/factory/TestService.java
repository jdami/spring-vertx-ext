package org.jacpfx.test.vertx.spring.factory;

import org.springframework.context.annotation.Scope;

/**
* @author Jochen Mader
*/
@Scope("singleton")
public class TestService {
    public String hello() {
        return "world";
    }
}
