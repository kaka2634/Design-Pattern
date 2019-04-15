package composite;

import composite.impl.Project;
import composite.impl.Todo;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternExample {
    public static void main(String[] args) {
        TodoList todo1 = new Todo("Todo1");
        TodoList todo2 = new Todo("Todo2");
        List<TodoList> todos = new ArrayList<>();
        todos.add(todo1);
        todos.add(todo2);
        TodoList todoList = new Project("project",todos);

        System.out.println(todoList.getHtml());
    }
}
