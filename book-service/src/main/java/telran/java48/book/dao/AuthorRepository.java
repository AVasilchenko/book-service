package telran.java48.book.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java48.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String>{

	
}
