package net.myhome.myhome.service;

/**
 * Service for security
 */
public interface SecurityService {
    String findzLoggedInUsername();
    void autoLogin (String username, String password);
}
