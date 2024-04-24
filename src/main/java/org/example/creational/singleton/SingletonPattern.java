package org.example.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattern {

    public static final String D_OUTPUT_FILE = "D://outputFile.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        MySingleton abc1 = MySingleton.getMySingletonInstance();
        MySingleton abc2 = MySingleton.getMySingletonInstance();
        System.out.println(abc1 == abc2);


        // To break singleton we can do:
        // 1. Serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(D_OUTPUT_FILE));
        objectOutputStream.writeObject(abc1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(D_OUTPUT_FILE));
        MySingleton deserializedObj = (MySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(abc1.hashCode() + " ---- " + deserializedObj.hashCode());

        // to handle this implement ReadResolve


        // 2. By Reflection
        Class<MySingleton> singletonClass = MySingleton.class;
        // Get the private constructor
        Constructor<MySingleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true); // makes constructor private to public

       /* // Create multiple instances
        MySingleton instance1 = constructor.newInstance();
        MySingleton instance2 = constructor.newInstance();
        // Print out the instances
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());*/


        // To prevent your Singleton pattern from being broken using reflection,
        // you can implement a mechanism that guards against multiple instantiations.
        // One common approach is to throw an exception if someone tries to create a second instance.

        // Enum are static values


        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setConfig("username", "admin");
        configManager.setConfig("password", "password123");

        String username = configManager.getConfig("username");
        System.out.println("Username: " + username);


    }
}
