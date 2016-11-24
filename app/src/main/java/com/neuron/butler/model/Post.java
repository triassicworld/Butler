package com.neuron.butler.model;

/**
 * Created by Victor on 11/10/2016.
 */

public class Post {
    private String title, description, category, postDate, deadline;
    private int fee;

    public Post(String title, String description, String category, String postDate, String deadline, int fee) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.postDate = postDate;
        this.deadline = deadline;
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
