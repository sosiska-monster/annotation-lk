package ru.bgpu.annotationlk;

import ru.bgpu.testdep.SayHello;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new SayHello().hello();

        Class<A> aClass = A.class;
        Method[] metods = aClass.getDeclaredMethods();
        Arrays.stream(metods).forEach(
                m -> System.out.println(m.getName())
        );
        for(Method m: metods) {
            System.out.println(m.getName());
        }
        try {
            Object a = aClass.getConstructor().newInstance();
            aClass.getMethod("hello").invoke(a);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Hello!";
    }
}
