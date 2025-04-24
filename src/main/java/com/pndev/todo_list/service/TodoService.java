package com.pndev.todo_list.service;

import com.pndev.todo_list.dto.CreateTodoDTO;
import com.pndev.todo_list.dto.UpdateTodoDTO;
import com.pndev.todo_list.entity.Todo;
import com.pndev.todo_list.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // Novo método com CreateTodoDTO
    public Todo createTodo(CreateTodoDTO dto) {
        Todo todo = new Todo();
        todo.setName(dto.getName());
        todo.setDescription(dto.getDescription());
        todo.setDone(false); // padrão como falso
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, UpdateTodoDTO dto) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        if (dto.getName() != null) {
            todo.setName(dto.getName());
        }
        if (dto.getDescription() != null) {
            todo.setDescription(dto.getDescription());
        }
        if (dto.getDone() != null) {
            todo.setDone(dto.getDone());
        }

        return todoRepository.save(todo);
    }

    public Todo updateTodoDone(Long id, Boolean done) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        todo.setDone(done);
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> getDoneTodos() {
        return todoRepository.findByDoneTrue();
    }

    public List<Todo> getTodoByName(String name) {
        return todoRepository.findByName(name);
    }
}
