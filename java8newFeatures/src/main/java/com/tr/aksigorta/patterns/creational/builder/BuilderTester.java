package com.tr.aksigorta.patterns.creational.builder;

public class BuilderTester
{

    public static void main(String[] args)
    {
        Computer computer = new Computer.ComputerBuilder("1", "2").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(computer);

    }

}
