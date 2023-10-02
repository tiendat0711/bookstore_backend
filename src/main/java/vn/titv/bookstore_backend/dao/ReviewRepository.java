package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}
