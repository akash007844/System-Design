package com.example.demo.service;

import com.example.demo.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private final Map<Integer, Task> taskRepo = new HashMap<>();
    private int currentId = 1;

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskRepo.values());
    }

    public Task createTask(String title) {
        Task task = new Task(currentId++, title, false);
        taskRepo.put(task.getId(), task);
        return task;
    }

    public Task updateTask(int id, boolean completed) {
        Task task = taskRepo.get(id);
        if (task != null) {
            task.setCompleted(completed);
        }
        return task;
    }

    public boolean deleteTask(int id) {
        return taskRepo.remove(id) != null;
    }
}
