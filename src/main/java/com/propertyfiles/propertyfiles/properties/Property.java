package com.propertyfiles.propertyfiles.properties;

public class Property  {

    private String endPointURL;
    private String clientID;
    private String clientSecret;

    public String getEndPointURL() {
        return endPointURL;
    }

    public String getClientID() {
        return clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setEndPointURL(String endPointURL) {
        this.endPointURL = endPointURL;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
