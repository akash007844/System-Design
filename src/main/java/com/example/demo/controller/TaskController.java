package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;
	
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestParam String title) {
        return taskService.createTask(title);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestParam boolean completed) {
        return taskService.updateTask(id, completed);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }
}
