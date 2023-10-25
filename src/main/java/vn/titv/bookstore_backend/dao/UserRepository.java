package vn.titv.bookstore_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import vn.titv.bookstore_backend.entity.User;

@RepositoryRestController(path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByUserName(String userName);

    boolean existsByEmail(String email);
}
