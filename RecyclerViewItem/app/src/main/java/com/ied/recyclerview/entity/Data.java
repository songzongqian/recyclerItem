package com.ied.recyclerview.entity;

public class Data {
    public int icon;
    public String username;
    public String message;

    public Data(int icon, String username, String message) {
        this.icon = icon;
        this.username = username;
        this.message = message;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
