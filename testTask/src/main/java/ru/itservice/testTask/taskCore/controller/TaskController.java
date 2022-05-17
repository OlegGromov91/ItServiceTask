package ru.itservice.testTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itservice.testTask.model.Task;
import ru.itservice.testTask.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping()
    public ResponseEntity<List<Task>> showTasks() {
        List<Task> tasks = taskService.showTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
        return ResponseEntity.ok().build();
    }

}
