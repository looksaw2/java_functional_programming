package org.example;

public class CurryString2<A,B,C,D> {
    public Function<A,Function<B,Function<C,Function<D,String>>>> f(){
        return a -> b -> c -> d -> String.format("%s , %s , %s %s", a, b, c, d);
    }
}
