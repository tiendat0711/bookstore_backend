package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import vn.titv.bookstore_backend.entity.Payment;

@RepositoryRestController(path = "payment")
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    
}
