package com.tr.aksigorta.patterns.behavioral.interpreter;

public class IntToHexExpression implements Expression
{

    private int i;

    public IntToHexExpression(int c)
    {
        this.i = c;
    }

    public String interpret(InterpreterContext ic)
    {
        return ic.getHexadecimalFormat(i);
    }

}