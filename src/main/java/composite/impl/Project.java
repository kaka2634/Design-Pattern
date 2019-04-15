package composite.impl;

import composite.TodoList;

import java.util.List;

public class Project implements TodoList {
    private String title;
    //Has collection of Component
    private List<TodoList> todos;

    //Use constructor to enable immutability
    //We can also use add and remove method for todos, but it will make structure mutatable
    public Project(String title, List<TodoList> todos) {
        this.title = title;
        this.todos = todos;
    }

    @Override
    public String getHtml() {
        String html = "<h1>";
        html += this.title;
        html += "</h1><ul>";

        for (TodoList t : todos) {
            html += "<li>";
            //!!!Key part -> recursion for composite pattern
            html += t.getHtml();
            html += "</li>";
        }
        html += "</ul>";
        return html;
    }
}
