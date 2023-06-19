package com.asdrubal.teste_01.repository;

import com.asdrubal.teste_01.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
