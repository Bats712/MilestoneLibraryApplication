package com.champsoft.milestonelibraryapplication.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book,Long> {
    Long id(Long id);
}
