package org.example.structural.decorator;

// Concrete decorator adding spell checking functionality
public class SpellCheckDecorator extends TextDecorator {
    public SpellCheckDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String write(String text) {
        String correctedText = spellCheck(text);
        return super.write(correctedText);
    }

    private String spellCheck(String text) {
        return text.replaceAll("teh", "the");
    }
}

