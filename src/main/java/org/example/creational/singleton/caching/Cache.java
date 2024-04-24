package org.example.creational.singleton.caching;

public interface Cache<K, V> {
    void put(K key, V value);

    V get(K key);

    void clear();
}
