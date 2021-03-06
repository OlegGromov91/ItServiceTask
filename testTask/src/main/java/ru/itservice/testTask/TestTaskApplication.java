package ru.itservice.testTask.taskCore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.itservice.testTask.taskCore.model.Task;
import ru.itservice.testTask.taskCore.model.TaskType;
import ru.itservice.testTask.taskCore.repository.TaskRepository;

@SpringBootApplication
public class TestTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTaskApplication.class, args);

	}



	@Bean
	CommandLineRunner runner(TaskRepository taskRepository) {
		return args ->
		{
			taskRepository.save(Task.builder().
					taskData("test").taskType(TaskType.HALF_MAGIC_CUBE).build());

			taskRepository.save(Task.builder().
					taskData("tes22t").taskType(TaskType.LEXICOGRAPHIC_ORDER).build());

		};
	}
}