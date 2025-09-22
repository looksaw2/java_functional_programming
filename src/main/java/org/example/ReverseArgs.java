package org.example;

public class ReverseArgs<T,U,V> {
    public Function<U,Function<T,V>> reverseArgs(Function<T,Function<U,V>> f){
        return u -> t -> f.apply(t).apply(u);
    }
}
