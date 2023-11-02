package telran.java48.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.java48.book.model.Publisher;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {

	@PersistenceContext
	EntityManager em;
	
//	@Override
//	public List<String> findPublishersByAuthor(String authorName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Stream<Publisher> findDistinctByBooksAuthorsName(String authorName) {
		String query = "select distinct p from Publisher p join p.books b join b.authors a where a.name = :authorName";
		return em.createQuery(query, Publisher.class)
				.setParameter("authorName", authorName)
				.getResultList()
				.stream();
	}

	@Override
	public Optional<Publisher> findById(String publisher) {
		return Optional.ofNullable(em.find(Publisher.class, publisher));
	}

	@Override
	public Publisher save(Publisher publisher) {
		em.persist(publisher);
//		em.merge(publisher);
		return publisher;
	}

}
