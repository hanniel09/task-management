package com.hanniel.todolist.Dtos;

import com.hanniel.todolist.domain.tasks.TaskStatus;

public record TaskDTO(String name, TaskStatus taskStatus, String description) {
}
