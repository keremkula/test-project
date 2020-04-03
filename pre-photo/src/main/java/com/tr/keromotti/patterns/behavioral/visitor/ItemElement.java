package com.tr.keromotti.patterns.behavioral.visitor;

public interface ItemElement
{

    public int accept(ShoppingCartVisitor visitor);
}