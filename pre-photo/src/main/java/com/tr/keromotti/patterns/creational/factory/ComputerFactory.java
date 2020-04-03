package com.tr.keromotti.patterns.creational.factory;

public class ComputerFactory
{

    public static Computer getComputer(String type, String ram, String hdd, String cpu)
    {
        Computer computer = null;
        if ("pc".equalsIgnoreCase(type))
        {
            computer = new PC(ram, hdd, cpu);
        }
        else if ("server".equalsIgnoreCase(type))
        {
            computer = new Server(ram, hdd, cpu);
        }

        return computer;
    }

}
