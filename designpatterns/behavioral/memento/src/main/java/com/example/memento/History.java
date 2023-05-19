package com.example.memento;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState){
        states.add(editorState);
    }
    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }

}
