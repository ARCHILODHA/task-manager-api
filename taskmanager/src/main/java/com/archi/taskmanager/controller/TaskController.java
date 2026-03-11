package com.archi.taskmanager.controller;

import com.archi.taskmanager.dto.TaskDTO;
import com.archi.taskmanager.entity.Task;
import com.archi.taskmanager.service.TaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

// import java.util.List;


@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

   @GetMapping
public Page<Task> getAllTasks(Pageable pageable) {
    return taskService.getAllTasks(pageable);
}

    @PostMapping
public Task createTask(@Valid @RequestBody TaskDTO taskDTO) {

    Task task = new Task();
    task.setTitle(taskDTO.getTitle());
    task.setDescription(taskDTO.getDescription());
    task.setCompleted(taskDTO.isCompleted());

    return taskService.createTask(task);
}

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
    return taskService.updateTask(id, task);
}
}
