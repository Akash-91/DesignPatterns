package org.example.creational.singleton;

import java.io.Serializable;

public class MySingleton implements Serializable {

    private static MySingleton instance = null; // not doing eager initialization

    private MySingleton() {
        if (instance != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    /**
     * static method so that we have class level locking
     *
     * @return
     */
    public static MySingleton getMySingletonInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
