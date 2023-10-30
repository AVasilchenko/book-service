package telran.java48.book.service;

import telran.java48.book.dto.AuthorDto;
import telran.java48.book.dto.BookDto;

public interface BookService {
	
	boolean addBook(BookDto bookDto);
	
	BookDto findBookByIsbn(String isbn);
	
	BookDto remove(String isbn);
	
	BookDto updadeBook(String isbn, String title);
	
	Iterable<BookDto> findBooksByAuthor(String authorName);
	
	Iterable<BookDto> findBooksByPublisher(String publisherName);
	
	Iterable<AuthorDto> findBookAuthors(String isbn);
	
	Iterable<String> findPublishersByAuthor(String authorName);
	
	AuthorDto removeAuthor(String authorName);
	
}
