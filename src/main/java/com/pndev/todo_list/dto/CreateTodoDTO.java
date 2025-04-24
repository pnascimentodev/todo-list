package com.pndev.todo_list.dto;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public class CreateTodoDTO {

    @NotBlank(message = "O nome não pode ser vazio")

    public String name;

    public String description;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        return this.description = description;
    }
}
