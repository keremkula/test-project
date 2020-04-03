package com.tr.aksigorta.patterns.creational.singleton;

public class SingletonTester
{

    public static void main(String[] args)
    {
        
        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
        
        System.out.println(ThreadSafeSingleton.getInstance1());
        System.out.println(ThreadSafeSingleton.getInstance1());
        System.out.println(ThreadSafeSingleton.getInstance1());
        System.out.println(ThreadSafeSingleton.getInstance1());
        System.out.println(ThreadSafeSingleton.getInstance1());
        System.out.println(ThreadSafeSingleton.getInstance1());

    }

}
