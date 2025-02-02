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
			repository.save(new Book("Title", "Author", "ISBN", 2000, 2));
			repository.save(new Book("book1", "author1", "ISBN1", 2001, 2.1));
		};
	}

}
