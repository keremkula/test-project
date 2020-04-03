package com.tr.keromotti.patterns.behavioral.command;

public class CloseFileCommand implements Command
{

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs)
    {
        this.fileSystem = fs;
    }

    public void execute()
    {
        this.fileSystem.closeFile();
    }

}
