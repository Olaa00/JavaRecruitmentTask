package com.ola.javarecruitmenttask;

import com.ola.javarecruitmenttask.repo.AuthorDto;
import com.ola.javarecruitmenttask.repo.AuthorRepo;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route
public class AuthorGui extends VerticalLayout {
    private AuthorRepo authorRepo;

    private AuthorGui(AuthorRepo authorRepo){
        this.authorRepo = authorRepo;

        List<AuthorDto> list = authorRepo.getCategoryCount();
        Grid<AuthorDto> grid =  new Grid<>(AuthorDto.class);
        grid.setItems(list);
        add(grid);

    }
}
