package org.example.structural.decorator;

public class DecoratorClient {

    public static void main(String[] args) {

        TextEditor basicTextEditor = new BasicTextEditor();
        TextEditor spellCheckedEditor = new SpellCheckDecorator(basicTextEditor);
        System.out.println(spellCheckedEditor.write("This is an example of teh Decorator pattern."));
    }
}
