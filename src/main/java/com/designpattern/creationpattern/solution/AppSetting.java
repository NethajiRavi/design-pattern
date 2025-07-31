package com.designpattern.creationpattern.solution;

public class AppSetting {

    private static  AppSetting instance;

    private String dbUrl;
    private String apiKey;

    private AppSetting() {
        this.dbUrl = "dfbgnh";
        this.apiKey = "sdfgfds";
    }

    public  static synchronized  AppSetting  getInstance(){
        if(instance == null){
            instance =  new AppSetting();
        }
        return instance;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}




