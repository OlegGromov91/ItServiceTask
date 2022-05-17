package ru.itservice.testTask.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itservice.testTask.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
