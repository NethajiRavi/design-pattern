package com.designpattern.structuralPattern.Facadepattern.solution;

public class APIGateway {


    private OrderService orderService =  new OrderService();
    private PaymentService paymentService =  new PaymentService();
    private UserService userService =  new UserService();



    public  String getFullOrderDetails(String orderIs,String paymentId,String userId){

        String orderDetails = orderService.getOrderDetails(orderIs);
        String paymentDetails= paymentService.getOrderDetails(paymentId);
        String userDetails = userService.getUserDetails(userId);

        return orderDetails + paymentDetails + userDetails;
    }
}
