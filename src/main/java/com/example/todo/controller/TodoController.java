package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @PostMapping
    public Todo createTodo(@RequestParam String title){
        return todoService.createTodo(title);
    }
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
    @PutMapping("/{id}")
    public Todo completeTodo(@PathVariable Long id) {
        return todoService.completeTodo(id);
    }


    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

}
