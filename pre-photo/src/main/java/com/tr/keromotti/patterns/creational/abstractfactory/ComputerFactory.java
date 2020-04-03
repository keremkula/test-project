package com.tr.keromotti.patterns.creational.abstractfactory;

import com.tr.keromotti.patterns.creational.factory.Computer;

public class ComputerFactory
{

    public static Computer getComputer(ComputerAbstractFactory factory)
    {
        return factory.createComputer();
    }
}
