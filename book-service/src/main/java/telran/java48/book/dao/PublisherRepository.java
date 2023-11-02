package telran.java48.book.dao;



import java.util.Optional;
import java.util.stream.Stream;


import telran.java48.book.model.Publisher;

public interface PublisherRepository {

//	@Query("select distinct p.publisherName from Book b join b.authors a join b.publisher p where a.name=?1")
//	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String authorName);

	Optional<Publisher> findById(String publisher);

	Publisher save(Publisher publisher);
}
