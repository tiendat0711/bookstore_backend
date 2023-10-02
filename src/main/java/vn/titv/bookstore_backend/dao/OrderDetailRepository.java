package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    
}
