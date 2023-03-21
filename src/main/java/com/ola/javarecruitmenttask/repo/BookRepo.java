package com.ola.javarecruitmenttask.repo;

import com.ola.javarecruitmenttask.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository <Book, Long>{
}
