package com.ola.javarecruitmenttask.repo;

import com.ola.javarecruitmenttask.entity.Author;
import com.ola.javarecruitmenttask.entity.Book;
import com.ola.javarecruitmenttask.entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class Start {
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public Start(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;

        Book book1 = new Book();
        book1.setTitle("Life");
        book1.setIsbn("5248-dasfe");
        book1.setBookCategory(BookCategory.COMEDY);

        Book book2 = new Book();
        book2.setTitle("Woman to be");
        book2.setIsbn("5846-rdgh");
        book2.setBookCategory(BookCategory.COMEDY);

        Book book3 = new Book();
        book3.setTitle("Power of intuition");
        book3.setIsbn("48451-02");
        book3.setBookCategory(BookCategory.DRAMA);

        Author author1 = new Author();
        author1.setName("Ola");
        author1.setSurname("Beczkowska");
        author1.setBookSet(Stream.of(book1, book2, book3).collect(Collectors.toSet()));
        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);
        authorRepo.save(author1);


//
//        Book book4 = new Book();
//        book4.setTitle("Poland");
//        book4.setIsbn("1431rfs");
//        book4.setBookCategory(BookCategory.DRAMA);
//
//        Book book5 = new Book();
//        book5.setTitle("Life");
//        book5.setIsbn("85142000-rdgh");
//        book5.setBookCategory(BookCategory.COMEDY);
//
//        Book book6 = new Book();
//        book6.setTitle("My history");
//        book6.setIsbn("3523465-fxbvc ");
//        book6.setBookCategory(BookCategory.AUTOBIOGRAPHY);
//
//        Author author2 = new Author();
//        author2.setName("Natalia");
//        author2.setSurname("Polak");
//        author2.setBookSet(Stream.of(book4,book5, book6).collect(Collectors.toSet()));
//
//
//
//        bookRepo.save(book4);
//        bookRepo.save(book5);
//        bookRepo.save(book6);
//        authorRepo.save(author2);
}

}
