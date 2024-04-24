package org.example.structural.decorator;

// Concrete component implementing the base functionality
public class BasicTextEditor implements TextEditor {
    @Override
    public String write(String text) {
        return "Basic Text " + text;
    }
}
