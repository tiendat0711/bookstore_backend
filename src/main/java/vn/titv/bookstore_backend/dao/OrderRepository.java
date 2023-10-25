package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import vn.titv.bookstore_backend.entity.Order;

@RepositoryRestController(path = "orders")
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
