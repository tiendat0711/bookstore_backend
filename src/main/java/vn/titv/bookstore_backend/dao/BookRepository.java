package vn.titv.bookstore_backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import vn.titv.bookstore_backend.entity.Book;




@RepositoryRestController(path = "books")
public interface BookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findBookByBookNameContaining(@RequestParam("bookName") String bookName, Pageable pageable);

    Page<Book> findBookByCategories_categoryId(@RequestParam("categoryId") int categoryId, Pageable pageable);

    Page<Book> findBookByBookNameContainingAndCategories_categoryId(@RequestParam("bookName") String bookName,
                                                                    @RequestParam("categoryId") int categoryId,
                                                                    Pageable pageable);
}
