package org.example.structural.decorator;

// Decorator class adding additional functionality
public abstract class TextDecorator implements TextEditor {

    private TextEditor textEditor;

    public TextDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String write(String text) {
        return textEditor.write(text);
    }
}
