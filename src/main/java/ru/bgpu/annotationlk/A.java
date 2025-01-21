package ru.bgpu.annotationlk;

public class A {

    @AppConfig
    private String host;

    public void hello() {
        System.out.println("!");
    }
}
