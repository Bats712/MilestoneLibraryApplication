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
    private final BookRepository bookRepository;
    private static final Logger logger = LoggerFactory.getLogger(MilestoneLibraryApplication.class);

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

        // ---------- AUTHORS ----------
        Author author1 = new Author("Dylon", "Pelltire", "How to be a bird");
        Author author2 = new Author("Edward", "Goncialves", "How to be a really good student");
        Author author3 = new Author("Hickle", "Haichiri", "Java101");

        Author author4 = new Author("Alfred", "Moritz", "Spring & Seasons");
        Author author5 = new Author("Cynthia", "Karswell", "Byte Warriors");
        Author author6 = new Author("Marcus", "Delmere", "Algorithm Shadows");
        Author author7 = new Author("Veronica", "Strathmore", "Into the Loop");
        Author author8 = new Author("Jonas", "Whitlock", "Compiler Returns");
        Author author9 = new Author("Elena", "Vorst", "Hibernate Secrets");
        Author author10 = new Author("Henry", "Corvin", "Knight of Databases");

        Author author11 = new Author("Dimitri", "Halsen", "Reactors Rising");
        Author author12 = new Author("Gloria", "Fincham", "Wizard of APIs");
        Author author13 = new Author("Samuel", "Quill", "Persistence Paths");
        Author author14 = new Author("Marissa", "Holt", "Golden Bean");
        Author author15 = new Author("Ivan", "Talloren", "Microservice Attack");
        Author author16 = new Author("Felix", "Browden", "Missing Endpoint");
        Author author17 = new Author("Helena", "Vandor", "Cloudsmith Realm");
        Author author18 = new Author("Barry", "Kindwell", "Constructor's Secret");
        Author author19 = new Author("Clara", "Windshell", "Destiny Streams");
        Author author20 = new Author("Oscar", "Delling", "NullPointer Revenge");

        Author author21 = new Author("Marcel", "Dray", "Phantom Framework");
        Author author22 = new Author("Talia", "Mistborn", "Encryption Echoes");
        Author author23 = new Author("Graham", "Kettler", "Beyond HTTPS");
        Author author24 = new Author("Nadia", "Wolford", "Forbidden Algorithm");
        Author author25 = new Author("Harold", "Stern", "Kubernetes Kingdom");
        Author author26 = new Author("Elise", "Montara", "Time-Travel Developer");
        Author author27 = new Author("Raphael", "Steinhardt", "JVM Journey");
        Author author28 = new Author("Olivia", "Proudmoor", "Two Threads Tale");
        Author author29 = new Author("Bandel", "Pierce", "Server Cried Night");
        Author author30 = new Author("Wendy", "Marquess", "Production Escape");

        Author author31 = new Author("Tobias", "Harren", "Lost Syntax");
        Author author32 = new Author("Miranda", "Tullis", "Static Fields Secret");
        Author author33 = new Author("Roland", "Mersh", "Backend Whispers");
        Author author34 = new Author("Isabelle", "Dupont", "Frontend Knight");
        Author author35 = new Author("Lance", "Morrow", "Architect Prophecy");
        Author author36 = new Author("Sabrina", "Kreel", "Data Towers Fall");
        Author author37 = new Author("Terrence", "Bellamy", "DTO Vengeance");
        Author author38 = new Author("Elara", "Marchen", "Repository Shadow");
        Author author39 = new Author("Corwin", "Halden", "Infinite Request");
        Author author40 = new Author("Yvette", "Moriano", "Ages of Spring");

        Author author41 = new Author("Darrin", "Lockridge", "Frozen Protocol");
        Author author42 = new Author("Nora", "Jetwood", "Load Balancer Siege");
        Author author43 = new Author("Elliot", "Ramford", "Jade Controller");
        Author author44 = new Author("Silvia", "Trent", "Garden of Gateways");
        Author author45 = new Author("Benton", "Crowley", "Wireless Realm");
        Author author46 = new Author("Gabriella", "Voss", "Merchant of Middleware");
        Author author47 = new Author("Finn", "Ashford", "Cache Lords");

        // ---------- SAVE AUTHORS ----------
        authorRepository.saveAll(Arrays.asList(
                author1, author2, author3,
                author4, author5, author6, author7, author8, author9, author10,
                author11, author12, author13, author14, author15, author16, author17, author18, author19, author20,
                author21, author22, author23, author24, author25, author26, author27, author28, author29, author30,
                author31, author32, author33, author34, author35, author36, author37, author38, author39, author40,
                author41, author42, author43, author44, author45, author46, author47
        ));

        // ---------- SAVE BOOKS ----------
        this.bookRepository.save(new Book("Lord of the Jewelry", "Dylon Pelltire", 2024, author1));
        this.bookRepository.save(new Book("Larry Botter", "Edward Goncialves", 2024, author2));
        this.bookRepository.save(new Book("The Legend of Java", "Hickle Haichiri", 2024, author3));

        this.bookRepository.save(new Book("The Chronicles of Spring", "Alfred Moritz", 2024, author4));
        this.bookRepository.save(new Book("The Last Byte Warrior", "Cynthia Karswell", 2024, author5));
        this.bookRepository.save(new Book("Shadow Algorithms", "Marcus Delmere", 2024, author6));
        this.bookRepository.save(new Book("The Infinite Loop", "Veronica Strathmore", 2024, author7));
        this.bookRepository.save(new Book("Return of the Compiler", "Jonas Whitlock", 2024, author8));
        this.bookRepository.save(new Book("Secrets of Hibernate", "Elena Vorst", 2024, author9));
        this.bookRepository.save(new Book("The Database Knight", "Henry Corvin", 2024, author10));

        this.bookRepository.save(new Book("Rise of the Reactors", "Dimitri Halsen", 2024, author11));
        this.bookRepository.save(new Book("The Wizard of APIs", "Gloria Fincham", 2024, author12));
        this.bookRepository.save(new Book("Paths of Persistence", "Samuel Quill", 2024, author13));
        this.bookRepository.save(new Book("The Golden Bean", "Marissa Holt", 2024, author14));
        this.bookRepository.save(new Book("Attack on Microservice", "Ivan Talloren", 2024, author15));
        this.bookRepository.save(new Book("The Mystery of the Missing Endpoint", "Felix Browden", 2024, author16));
        this.bookRepository.save(new Book("Realm of the Cloudsmiths", "Helena Vandor", 2024, author17));
        this.bookRepository.save(new Book("The Constructor's Secret", "Barry Kindwell", 2024, author18));
        this.bookRepository.save(new Book("Streams of Destiny", "Clara Windshell", 2024, author19));
        this.bookRepository.save(new Book("Revenge of the NullPointer", "Oscar Delling", 2024, author20));

        this.bookRepository.save(new Book("The Phantom Framework", "Marcel Dray", 2024, author21));
        this.bookRepository.save(new Book("Echoes of Encryption", "Talia Mistborn", 2024, author22));
        this.bookRepository.save(new Book("The Portal Beyond HTTPS", "Graham Kettler", 2024, author23));
        this.bookRepository.save(new Book("The Forbidden Algorithm", "Nadia Wolford", 2024, author24));
        this.bookRepository.save(new Book("The Kingdom of Kubernetes", "Harold Stern", 2024, author25));
        this.bookRepository.save(new Book("The Time-Traveling Developer", "Elise Montara", 2024, author26));
        this.bookRepository.save(new Book("Journey to the JVM", "Raphael Steinhardt", 2024, author27));
        this.bookRepository.save(new Book("The Tale of Two Threads", "Olivia Proudmoor", 2024, author28));
        this.bookRepository.save(new Book("The Night the Server Cried", "Bandel Pierce", 2024, author29));
        this.bookRepository.save(new Book("Escape from Production", "Wendy Marquess", 2024, author30));

        this.bookRepository.save(new Book("The Lost Syntax", "Tobias Harren", 2024, author31));
        this.bookRepository.save(new Book("The Secret of Static Fields", "Miranda Tullis", 2024, author32));
        this.bookRepository.save(new Book("Whispers of the Backend", "Roland Mersh", 2024, author33));
        this.bookRepository.save(new Book("Legend of the Frontend Knight", "Isabelle Dupont", 2024, author34));
        this.bookRepository.save(new Book("The Architect's Prophecy", "Lance Morrow", 2024, author35));
        this.bookRepository.save(new Book("Fall of the Data Towers", "Sabrina Kreel", 2024, author36));
        this.bookRepository.save(new Book("Vengeance of the DTOs", "Terrence Bellamy", 2024, author37));
        this.bookRepository.save(new Book("Shadow of the Repository", "Elara Marchen", 2024, author38));
        this.bookRepository.save(new Book("The Infinite Request", "Corwin Halden", 2024, author39));
        this.bookRepository.save(new Book("The Spring of Ages", "Yvette Moriano", 2024, author40));

        this.bookRepository.save(new Book("The Frozen Protocol", "Darrin Lockridge", 2024, author41));
        this.bookRepository.save(new Book("Siege of the Load Balancers", "Nora Jetwood", 2024, author42));
        this.bookRepository.save(new Book("The Jade Controller", "Elliot Ramford", 2024, author43));
        this.bookRepository.save(new Book("The Garden of Gateways", "Silvia Trent", 2024, author44));
        this.bookRepository.save(new Book("Whispers of the Wireless Realm", "Benton Crowley", 2024, author45));
        this.bookRepository.save(new Book("The Merchant of Middleware", "Gabriella Voss", 2024, author46));
        this.bookRepository.save(new Book("Chronicles of the Cache Lords", "Finn Ashford", 2024, author47));


    }
}