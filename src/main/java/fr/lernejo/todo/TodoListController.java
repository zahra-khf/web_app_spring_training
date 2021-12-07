package fr.lernejo.todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class TodoListController {
    private ArrayList <Todo> TodoArrayList= new ArrayList<> ();

    @PostMapping(value = "/api/todo")
    public void add_list(@RequestBody Todo todo){
        this.TodoArrayList.add(todo);
    }

    @GetMapping(value = "/api/todo")
    public ArrayList <Todo> get_list(){
        return TodoArrayList;
    }


}
