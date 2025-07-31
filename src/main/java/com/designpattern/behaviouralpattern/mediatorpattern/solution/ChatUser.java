package com.designpattern.behaviouralpattern.mediatorpattern.solution;

public class ChatUser {

    private String name;
    private ChatMediator chatMediator;


    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg){
        chatMediator.sendMessage(msg,this);
    }


    public String getName() {
        return name;
    }


    public void recieveMessage(String msg,ChatUser chatUser){
        System.out.println(this.name + "rcieved Message"+msg + "from" + chatUser.getName());

    }

}
