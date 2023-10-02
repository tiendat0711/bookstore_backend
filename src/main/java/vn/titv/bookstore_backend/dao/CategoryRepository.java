package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
