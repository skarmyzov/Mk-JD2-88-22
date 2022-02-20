package by.it.academy.MessengerHomeTask01.services.api;

import by.it.academy.MessengerHomeTask01.dto.Message;
import by.it.academy.MessengerHomeTask01.dto.User;


import java.util.ArrayList;
import java.util.Map;

public interface IStorage {
    Map<String, User> getUsersLogins();
    Map<String, ArrayList<Message>> getMessages();
    boolean haveUserExistence(String login);
    boolean checkPassword(String login, String password);
    void addUser(String login, String password, String name, String birthday);
    User getUser(String login);
    void addMessage(String receiver, String loginFrom, String message);
    ArrayList<Message> getMessageList(String login);
}
