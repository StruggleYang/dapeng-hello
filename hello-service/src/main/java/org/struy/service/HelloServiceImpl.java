package org.struy.service;

import com.github.dapeng.core.SoaException;
import org.struy.hello.domain.Hello;
import org.struy.hello.service.HelloService;

/**
 * @author with struy.
 * Create by 2018/6/24 09:07
 * email :yq1724555319@gmail.com
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) throws SoaException {
        return "hello : " + name;
    }

    @Override
    public String sayHello2(Hello hello) throws SoaException {
        return "hello : " + hello.name + "-> " + hello.message;
    }
}
