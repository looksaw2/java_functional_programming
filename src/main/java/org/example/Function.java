package org.example;

@FunctionalInterface
public interface Function<T,U> {
    U apply(T t);
    default <V> Function<V,U> compose(Function<V,T> f){
        return x -> apply(f.apply(x));
    }
}
