package by.it.academy.MessengerHomeTask01.services.api;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IChatService {
    void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
    void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
    void viewProfile(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException;
    void createMessage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
    void viewChats(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;


}
