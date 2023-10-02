package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Delivery;


public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    
}
