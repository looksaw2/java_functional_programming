package org.example;

@FunctionalInterface
public interface Effect<T> {
    void apply(T t);
}
