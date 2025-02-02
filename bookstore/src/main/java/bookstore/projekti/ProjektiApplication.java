package bookstore.projekti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.projekti.domain.Book;
import bookstore.projekti.domain.BookRepository;

@SpringBootApplication
public class ProjektiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektiApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookCmd(BookRepository repository){
		return (args) -> {
			repository.save(new Book("Talo taivaansinisellä merellä", "TJ Klune", "9789511383260", 2021, 15.95));
			repository.save(new Book("Rósa & Björk", "Satu Rämö", "9789510504048", 2024, 13.95));
			repository.save(new Book("Käräjät", "Markus Nummi", "9789511370338", 2024, 36.95));
			repository.save(new Book("Elämäni miehet", "Samuli Putro", "9789510510049", 2025, 34.95));
		};
	}

}
