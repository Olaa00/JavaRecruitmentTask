package com.ola.javarecruitmenttask.repo;

import com.ola.javarecruitmenttask.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {
     @Query(value = "select author.name as author, count(author.name) as CategoryCount, book.book_category as BookCategory " +
             "from author, book\n" +
             "group by book.book_category", nativeQuery = true)
     List<AuthorDto> getCategoryCount();
    //data transfer object
}
