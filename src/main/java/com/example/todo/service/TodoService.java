package com.example.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoRepository;

@Service
public class TodoService {
	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public Todo createTodo(String title) {
		Todo todo = new Todo(title);
		return todoRepository.save(todo);
	}

	public List<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	public Todo completeTodo(Long id) {
		Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
		todo.setCompleted(true);
		return todoRepository.save(todo);
	}

	public void deleteTodo(Long id) {
		todoRepository.deleteById(id);
	}
}
