package br.com.javacodex.bookstoremanager.repository;

import br.com.javacodex.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
