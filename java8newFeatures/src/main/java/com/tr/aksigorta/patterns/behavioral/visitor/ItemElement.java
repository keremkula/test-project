package com.tr.aksigorta.patterns.behavioral.visitor;

public interface ItemElement
{

    public int accept(ShoppingCartVisitor visitor);
}