package com.hanniel.todolist.controllers;

import com.hanniel.todolist.Dtos.TaskDTO;
import com.hanniel.todolist.domain.tasks.Task;
import com.hanniel.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping()
    public ResponseEntity<List<Task>> findAllTasks() {
        return new ResponseEntity<>(taskService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable Long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/find/{name}")
    public ResponseEntity<Task> findTaskByName(@PathVariable String name) {
        return new ResponseEntity<>(taskService.findByName(name), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Task> createTask(@RequestBody TaskDTO data) {
        return new ResponseEntity<>(taskService.saveTask(data), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody TaskDTO data, @PathVariable Long id) {
        return new ResponseEntity<>(taskService.updateTask(data, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
