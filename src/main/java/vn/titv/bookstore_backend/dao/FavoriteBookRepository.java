package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import vn.titv.bookstore_backend.entity.FavoriteBook;

@RepositoryRestController(path = "favorite-books")
public interface FavoriteBookRepository extends JpaRepository<FavoriteBook, Integer> {
    
}
