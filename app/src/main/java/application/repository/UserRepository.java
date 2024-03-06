package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.User;

public class UserRepository extends CrudRepository<User, Long> {
    public User findByUsername(String username);
    
}
