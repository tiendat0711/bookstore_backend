package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Image;


public interface ImageRepository extends JpaRepository<Image, Integer> {
    
}
