package com.designpattern.creationpattern.problem;

public class WithoutSingleton {

    public static void main(String[] args) {


        AppSetting appSetting =  new AppSetting();
        appSetting.getApiKey();


        AppSetting appSetting1 =  new AppSetting();
        appSetting1.getApiKey();


        if(appSetting == appSetting1){
            System.out.println("true");
        }




    }
}
