package org.example.creational.factory;
public class WindowsOperatingSystem extends OperatingSystem{
    public WindowsOperatingSystem(String version, String architecture) {
        super(version,architecture);
    }

    @Override
    public void changeDir(String dir) {
        //Windows command
    }

    @Override
    public void removeDir(String dir) {
        //Windows command
    }
}