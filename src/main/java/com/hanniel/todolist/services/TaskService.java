package com.hanniel.todolist.services;

import com.hanniel.todolist.Dtos.TaskDTO;
import com.hanniel.todolist.domain.tasks.Task;
import com.hanniel.todolist.exceptions.RecordNotFoundException;
import com.hanniel.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Task findByName(String name) {
        return taskRepository.findByName(name);
    }

    @Transactional
    public Task saveTask(TaskDTO data) {
        Task task = new Task(data);
        return taskRepository.save(task);
    }

    public Task updateTask(TaskDTO data, Long id) {
        Task taskSaved = findById(id);
        Task updatedTask = new Task(data);
        updatedTask.setId(taskSaved.getId());
        return taskRepository.save(updatedTask);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
