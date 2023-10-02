package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
