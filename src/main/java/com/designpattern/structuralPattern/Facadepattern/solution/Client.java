package com.designpattern.structuralPattern.Facadepattern.solution;

public class Client {
    public static void main(String[] args) {

        // client wants to interact with different service directly
        APIGateway apiGateway = new APIGateway();
        System.out.println(apiGateway.getFullOrderDetails("12", "21", "23"));

    }
}
