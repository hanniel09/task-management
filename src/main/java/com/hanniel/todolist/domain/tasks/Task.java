package com.hanniel.todolist.domain.tasks;

import com.hanniel.todolist.Dtos.TaskDTO;
import jakarta.persistence.*;

@Entity()
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "taskStatus")
    private TaskStatus taskStatus;

    @Column(name = "description")
    private String description;

    public Task() {
    }

    public Task(String name, TaskStatus taskStatus, String description) {
        this.name = name;
        this.taskStatus = taskStatus;
        this.description = description;
    }

    public Task(TaskDTO data){
        this.name = data.name();
        this.taskStatus = data.taskStatus();
        this.description = data.description();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
