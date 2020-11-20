package net.myhome.myhome.service;

/**
 * Service for security
 */
public interface SecurityService {
    String findzLoggedUsername();
    void autoLogin (String username, String password);
}
