package com.hanniel.todolist.domain.userRelationship;

import com.hanniel.todolist.domain.tasks.Task;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_relationship")
public class UserRelationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany()
    @JoinColumn(name = "id_tasks")
    private List<Task> tasks;

    public UserRelationship() {
    }

    public UserRelationship(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
