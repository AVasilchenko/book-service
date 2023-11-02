package telran.java48.book.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java48.book.model.Author;
import telran.java48.book.model.Publisher;

public interface AuthorRepository {

	Optional<Author> findById(String authorName);
	
	Author save(Author author);

	void delete(Author author);

	
}
