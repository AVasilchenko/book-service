package telran.java48.book.dao;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import telran.java48.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

	@PersistenceContext
	EntityManager em;
	
//	@Override
//	public Stream<Book> findByAuthorsName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Stream<Book> findByPublisherPublisherName(String publisherName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean existsById(String isbn) {
		return em.find(Book.class, isbn) != null;
	}

	@Override
//	@Transactional
	public Book save(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Optional<Book> findById(String isbn) {
		return Optional.ofNullable(em.find(Book.class, isbn));
	}

	@Override
	public void deleteById(String isbn) {
		Book book = em.find(Book.class, isbn);
		em.remove(book);
	}

}
