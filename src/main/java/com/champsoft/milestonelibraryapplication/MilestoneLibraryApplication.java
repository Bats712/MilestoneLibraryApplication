package com.champsoft.milestonelibraryapplication;

import com.champsoft.milestonelibraryapplication.datalayer.Author;
import com.champsoft.milestonelibraryapplication.datalayer.AuthorRepository;
import com.champsoft.milestonelibraryapplication.datalayer.Book;
import com.champsoft.milestonelibraryapplication.datalayer.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MilestoneLibraryApplication implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private static final Logger logger = LoggerFactory.getLogger(MilestoneLibraryApplication.class);
    private final BookRepository bookRepository;
    public MilestoneLibraryApplication(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(MilestoneLibraryApplication.class, args);
        logger.info("Application started");
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author("Dylon", "Pelltire", "How to be a bird");
        Author author2 = new Author ("Edward", "Goncialves", "how to be a really good student");
        Author author3 = new Author("Hickle", "Haichiri", "Java101");
        authorRepository.saveAll(Arrays.asList(author1, author2, author3));

        this.bookRepository.save(new Book("Lord of the jewelry", "Dylon Pelltire", 2024, author1));
        this.bookRepository.save(new Book("Larry Botter", "Edward Goncialves", 2024, author2));
        this.bookRepository.save(new Book("The Legend of Java", "Hickle Haichiri",  2024, author3));

        for (Book book : this.bookRepository.findAll()) {
            logger.info("Book: {}, author: {}", book, book.getAuthor());
        }


    }


}
