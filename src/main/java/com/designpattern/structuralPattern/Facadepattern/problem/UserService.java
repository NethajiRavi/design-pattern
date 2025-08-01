package com.designpattern.structuralPattern.Facadepattern.problem;

// microservice  problem  (Api gateWay)
public class UserService {


    public  String getUserDetails(String userId){
        return "User Details for UserId" + userId;
    }
}
