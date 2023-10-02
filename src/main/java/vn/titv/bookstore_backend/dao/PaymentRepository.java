package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.titv.bookstore_backend.entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    
}
