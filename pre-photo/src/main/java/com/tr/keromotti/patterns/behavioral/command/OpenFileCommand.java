package com.tr.keromotti.patterns.behavioral.command;

public class OpenFileCommand implements Command
{

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs)
    {
        this.fileSystem = fs;
    }

    public void execute()
    {
        // open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
