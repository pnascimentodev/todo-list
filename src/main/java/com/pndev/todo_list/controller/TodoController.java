package com.pndev.todo_list.controller;


import com.pndev.todo_list.dto.CreateTodoDTO;
import com.pndev.todo_list.dto.UpdateTodoDTO;
import com.pndev.todo_list.entity.Todo;
import com.pndev.todo_list.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@Valid @RequestBody CreateTodoDTO createTodoDTO) {
        Todo createdTodo = todoService.createTodo(createTodoDTO);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/done")
    public ResponseEntity<Todo> updateTodoDone(@PathVariable Long id, @RequestBody Boolean done) {
        Todo updated = todoService.updateTodoDone(id, done);
        return ResponseEntity.ok(updated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @Valid @RequestBody UpdateTodoDTO updateTodoDTO) {
        Todo updatedTodo = todoService.updateTodo(id, updateTodoDTO);
        return ResponseEntity.ok(updatedTodo);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Optional<Todo> todo = todoService.getTodoById(id);
        return todo.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/done")
    public List<Todo> getDoneTodos() {
        return todoService.getDoneTodos();
    }

    @GetMapping("/name")
    public List<Todo> getTodoByName(@RequestParam String name) {
        return todoService.getTodoByName(name);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
