package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.titv.bookstore_backend.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
