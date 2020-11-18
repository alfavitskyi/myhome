package net.myhome.myhome.dao;

import net.myhome.myhome.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
