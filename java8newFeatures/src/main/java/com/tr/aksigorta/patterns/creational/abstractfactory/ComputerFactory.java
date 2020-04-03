package com.tr.aksigorta.patterns.creational.abstractfactory;

import com.tr.aksigorta.patterns.creational.factory.Computer;

public class ComputerFactory
{

    public static Computer getComputer(ComputerAbstractFactory factory)
    {
        return factory.createComputer();
    }
}
