package com.example.memento;

import lombok.Data;

@Data
public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState editorState){
        content = editorState.getContent();
    }
}
