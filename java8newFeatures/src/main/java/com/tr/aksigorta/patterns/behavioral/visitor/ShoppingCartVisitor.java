package com.tr.aksigorta.patterns.behavioral.visitor;

public interface ShoppingCartVisitor
{

    int visit(Book book);

    int visit(Fruit fruit);
}