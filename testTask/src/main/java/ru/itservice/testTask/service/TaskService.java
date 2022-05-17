package ru.itservice.testTask.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itservice.testTask.model.Task;
import ru.itservice.testTask.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Transactional(readOnly = true)
    public List<Task> showTasks() {
        return (List<Task>) taskRepository.findAll();
    }
}
