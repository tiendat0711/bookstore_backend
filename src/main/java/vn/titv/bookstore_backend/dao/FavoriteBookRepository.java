package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.titv.bookstore_backend.entity.FavoriteBook;


public interface FavoriteBookRepository extends JpaRepository<FavoriteBook, Integer> {
    
}
