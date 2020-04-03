package com.tr.keromotti.patterns.behavioral.visitor;

public interface ShoppingCartVisitor
{

    int visit(Book book);

    int visit(Fruit fruit);
}