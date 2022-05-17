package ru.itservice.testTask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itservice.testTask.model.Task;
import ru.itservice.testTask.repository.TaskRepository;
import ru.itservice.testTask.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping()
    public ResponseEntity<List<Task>> showTasks() {
        List<Task> tasks = taskService.showTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

}
