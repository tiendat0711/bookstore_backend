package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import vn.titv.bookstore_backend.entity.Role;

@RepositoryRestController(path = "roles")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
