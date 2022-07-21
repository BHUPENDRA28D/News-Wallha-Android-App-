package com.example.newsapp;

import java.util.ArrayList;

public class MainNews {

    private String status;
    private String totlalResult;

    private ArrayList<ModelClass> articals;

    public MainNews(String status, String totlalResult, ArrayList<ModelClass> articals) {
        this.status = status;
        this.totlalResult = totlalResult;
        this.articals = articals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotlalResult() {
        return totlalResult;
    }

    public void setTotlalResult(String totlalResult) {
        this.totlalResult = totlalResult;
    }

    public ArrayList<ModelClass> getArticals() {
        return articals;
    }

    public void setArticals(ArrayList<ModelClass> articals) {
        this.articals = articals;
    }
}
