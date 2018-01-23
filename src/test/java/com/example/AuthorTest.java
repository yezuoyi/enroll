package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eda.enroll.EnrollApplication;
import com.eda.enroll.domain.model.Author;
import com.eda.enroll.domain.model.Book;
import com.eda.enroll.domain.repository.AuthorRepository;
import com.eda.enroll.domain.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EnrollApplication.class)
public class AuthorTest {

	@Autowired
	public AuthorRepository authorRepository;
	
	@Autowired
	public BookRepository bookRepository;
	@Test
	public void test() {
		List<Author> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Author author = new Author();
			author.setName("test"+i);
			Set<Book> books = new HashSet<Book>();
			for(int j=0;j<10;j++) {
				Book book = new Book();
				book.setName(author.getName()+"-["+j+"]");
				book.setAuthor(author);
				books.add(book);
			}
			author.setBooks(books);
			authorRepository.save(author);
			
		}
	}
	@Test
	public void findOneTest() {
		Author author = authorRepository.findOne(9L);
		Set<Book> books = author.getBooks();
		for(Book book:books) {
			System.out.println("name:"+book.getName());
		}
		
	}
}
