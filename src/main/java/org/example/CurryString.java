package org.example;

public class CurryString<A,B,C,D> {
    public String func(A a, B b, C c, D d) {
        return String.format("%s , %s , %s , %s ", a, b, c, d);
    }
}
