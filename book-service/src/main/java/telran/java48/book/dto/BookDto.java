package telran.java48.book.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookDto {
	String isbn;
	String title;
	Set<AuthorDto> authors;
	String publisher;
}
