package com.mphunt.imagegallery;

public class ImageDTO {
    private String title;
    private String imageUrl;

    public ImageDTO(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
