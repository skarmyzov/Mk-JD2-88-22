package by.it.academy.MessengerHomeTask01.servlets;


import by.it.academy.MessengerHomeTask01.services.ChatService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Message", urlPatterns = "/message")
public class MessageServlet extends HttpServlet {
    private ChatService chatService = ChatService.getChatService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        chatService.createMessage(req,resp);
    }
}
