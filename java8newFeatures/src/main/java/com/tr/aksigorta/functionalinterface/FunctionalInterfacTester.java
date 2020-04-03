package com.tr.aksigorta.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfacTester
{

    public static void main(String[] args)
    {
        Foo foo = (x, y) -> Math.pow(x, y);
        double sonuc = foo.apply(3, 2);
        System.out.println("Sonuc : " + sonuc);
        
        
        
        List<String> namesList = Arrays.asList("Ali", "Veli", "49" ,"50");
        

    }

}
