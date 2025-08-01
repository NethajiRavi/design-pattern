package com.designpattern.structuralPattern.Facadepattern.problem;

public class Client {
    public static void main(String[] args) {



        // client wants to interact with different service directly

        UserService userService =  new UserService();
        OrderService orderService =  new OrderService();
        PaymentService  paymentService =  new PaymentService();

        System.out.println(userService.getUserDetails("132"));
        System.out.println(orderService.getOrderDetails("34"));
        System.out.println(paymentService.getOrderDetails("34"));

    }
}
