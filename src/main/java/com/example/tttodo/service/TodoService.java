package com.example.tttodo.service;

import com.example.tttodo.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
