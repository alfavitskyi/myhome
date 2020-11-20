package net.myhome.myhome.service;

import net.myhome.myhome.model.User;

/**
 * Service class for {@link net.myhome.myhome.model.User}
 */

public interface UserService {
    void save (User user);
    User findByUsername (String username);
}
