package ru.itservice.testTask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.itservice.testTask.model.Task;
import ru.itservice.testTask.model.TaskType;
import ru.itservice.testTask.repository.TaskRepository;

@SpringBootApplication
public class TestTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTaskApplication.class, args);
	}



	@Bean
	CommandLineRunner runner(TaskRepository taskRepository) {
		return args ->
		{
			taskRepository.save(Task.builder().taskData("hehehehe").taskType(TaskType.HALF_MAGIC_CUBE).build());

		};
	}
}