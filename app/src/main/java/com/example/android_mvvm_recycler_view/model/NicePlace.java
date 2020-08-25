package com.example.android_mvvm_recycler_view.model;

public class NicePlace {

    private String title;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public NicePlace() {
    }

    public NicePlace(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }
}
