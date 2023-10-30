package telran.java48.book.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import telran.java48.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
