package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import vn.titv.bookstore_backend.entity.OrderDetail;

@RepositoryRestController(path = "order-detail")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}
