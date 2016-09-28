package service;

/**
 * Created by chokst on 3/6/15.
 */
public class HelloWorld implements IHelloWorld {
    public String sayHello(String name) {
        return name + ", Hello World";
    }
}
