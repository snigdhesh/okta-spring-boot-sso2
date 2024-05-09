package com.example.oktaspringbootsso2.config.security;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.IOException;

public class OktaLogoutHandler implements LogoutSuccessHandler {
    private final String logoutUrl;

    public OktaLogoutHandler(String logoutUrl) {
        this.logoutUrl=logoutUrl;
    }
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.sendRedirect(logoutUrl);
    }
}
