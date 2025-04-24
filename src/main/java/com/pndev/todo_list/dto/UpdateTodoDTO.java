package com.pndev.todo_list.dto;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

public class UpdateTodoDTO {

    @NotNull
    public String name;

    public String description;

    public Boolean done;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
