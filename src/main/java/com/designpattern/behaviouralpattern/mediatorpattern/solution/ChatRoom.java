package com.designpattern.behaviouralpattern.mediatorpattern.solution;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<ChatUser> users;


    public ChatRoom() {
        this.users = new ArrayList<>();


    }

    @Override
    public void sendMessage(String msg, ChatUser user) {

        for(ChatUser chatUser : users){
            if(!chatUser.equals(user)){
                chatUser.recieveMessage(msg,user);
            }
        }

    }

    @Override
    public void addUser(ChatUser user) {
        this.users.add(user);

    }
}
