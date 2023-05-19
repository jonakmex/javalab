package com.example.memento;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MementoTest {
    private static Editor editor;
    private static History history;
    @BeforeAll
    public static void createEditor(){
        editor = new Editor();
        history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.createState();
    }
    @Test
    public void should_restore_to_b(){
        editor.setContent("c");
        editor.restore(history.pop());
        assertEquals("b",editor.getContent());
    }
}
