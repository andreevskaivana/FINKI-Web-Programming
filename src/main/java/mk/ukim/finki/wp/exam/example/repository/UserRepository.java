package mk.ukim.finki.wp.exam.example.repository;

import mk.ukim.finki.wp.exam.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
//prima 2 argumenti za koja klasa se odnesuva i koj e tipot na primaren kluc
    Optional<User> findByUsername(String username);
}
