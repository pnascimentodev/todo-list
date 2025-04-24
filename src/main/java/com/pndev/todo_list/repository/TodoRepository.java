package com.pndev.todo_list.repository;

import com.pndev.todo_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository <Todo, Long> {

    List<Todo>findByDoneTrue();

    List<Todo>findByName(String name);
}
