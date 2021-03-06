package composite.impl;

import composite.TodoList;

public class Todo implements TodoList {
    private String text;

    //Construct
    public Todo(String text){
        this.text = text;
    }

    @Override
    public String getHtml() {
        return this.text;
    }
}
