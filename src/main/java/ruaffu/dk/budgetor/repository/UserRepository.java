package ruaffu.dk.budgetor.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import ruaffu.dk.budgetor.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
