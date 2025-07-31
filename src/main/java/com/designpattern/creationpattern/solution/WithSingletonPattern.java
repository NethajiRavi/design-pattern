package com.designpattern.creationpattern.solution;


public class WithSingletonPattern {

    public static void main(String[] args) {



        AppSetting appSetting =  AppSetting.getInstance();
        appSetting.getApiKey();

        AppSetting appSetting1 =  AppSetting.getInstance();
        appSetting1.getApiKey();


        if(appSetting == appSetting1){
            System.out.println("true");
        }



    }
}
