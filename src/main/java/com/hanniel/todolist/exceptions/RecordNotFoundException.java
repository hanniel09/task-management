package com.hanniel.todolist.exceptions;

import java.io.Serial;

public class RecordNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public RecordNotFoundException(Long id){
        super("Task with id: " + id + "not found");
    }
}
