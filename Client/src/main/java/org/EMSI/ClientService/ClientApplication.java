package org.EMSI.ClientService;

import org.EMSI.ClientService.Model.Client;
import org.EMSI.ClientService.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initializeMySQLDatabase(ClientRepository clientRepository) {
		return args -> {
			// Clear existing data


			// Add new data for MySQL
			clientRepository.save(new Client(1L, "elbazi med amine", 26.0f));
			clientRepository.save(new Client(2L, "khalid abenay", 26.0f));
			clientRepository.save(new Client(3L, "bader ebzazen", 29.0f));
		};
	}
}
