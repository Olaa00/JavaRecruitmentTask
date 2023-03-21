package com.ola.javarecruitmenttask;

import com.ola.javarecruitmenttask.repo.AuthorDto;
import com.ola.javarecruitmenttask.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRestApi {
    private AuthorRepo authorRepo;

    @Autowired
    public AuthorRestApi(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }




    @GetMapping("/AuthorInfo")
    public List<AuthorDto> get(){
        return authorRepo.getCategoryCount();
    }
}
