
package com.cxf;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.cxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

