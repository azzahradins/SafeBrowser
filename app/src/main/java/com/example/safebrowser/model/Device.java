package com.example.safebrowser.model;

public class Device {
    String title, UrlSite, currentDate;

    public Device(String title, String urlSite, String currentDate) {
        this.title = title;
        UrlSite = urlSite;
        this.currentDate = currentDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlSite() {
        return UrlSite;
    }

    public void setUrlSite(String urlSite) {
        UrlSite = urlSite;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}
