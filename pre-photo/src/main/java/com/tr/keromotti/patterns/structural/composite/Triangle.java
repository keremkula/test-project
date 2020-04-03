package com.tr.keromotti.patterns.structural.composite;

public class Triangle implements Shape
{

    public void draw(String fillColor)
    {
        System.out.println("Drawing Triangle with color " + fillColor);
    }

}
