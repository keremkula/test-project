package com.tr.aksigorta.patterns.behavioral.command;

public interface FileSystemReceiver
{

    void openFile();

    void writeFile();

    void closeFile();
}