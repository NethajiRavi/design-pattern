package com.designpattern.creationpattern.problem;

public class AppSetting {


    private String dbUrl;
    private String apiKey;

    public AppSetting() {
        this.dbUrl = "SDFGHJ";
        this.apiKey = "ASDFGHGFDS";
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
