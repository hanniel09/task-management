package com.hanniel.todolist.Dtos;

import com.hanniel.todolist.domain.tasks.Task;

import java.util.List;

public record UserRelationship(List<Task> tasks) {
}
