package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
