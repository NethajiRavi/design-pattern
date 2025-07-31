package com.designpattern.behaviouralpattern.mediatorpattern.solution;

public class WithMediatorPattern {
    public static void main(String[] args) {



        ChatRoom chatRoom = new ChatRoom();

        ChatUser rahul =  new ChatUser("Rahul",chatRoom);
        ChatUser neha = new ChatUser("Neha",chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(neha);

        rahul.sendMessage("Hellp");




    }
}
