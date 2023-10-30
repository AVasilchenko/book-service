package telran.java48.book.dao;

import java.util.stream.Stream;

import org.hibernate.boot.jaxb.mapping.spi.JaxbPostRemove;
import org.springframework.data.jpa.repository.JpaRepository;

import telran.java48.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

	Stream<Book> findByAuthorsName(String name);
	
	Stream<Book> findByPublisherPublisherName(String publisherName);
	
}
