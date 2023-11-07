package com.hanniel.todolist.repositories;

import com.hanniel.todolist.domain.tasks.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
     Task findByName(String name);
}
