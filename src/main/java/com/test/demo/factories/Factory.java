package com.test.demo.factories;

public interface Factory<T> {
    void test(T t);

    void fake(T t);

    void count(T t);
}
