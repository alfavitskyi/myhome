package net.myhome.myhome.dao;

import net.myhome.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User, Long> {
    User findByUsername (String username);
}
