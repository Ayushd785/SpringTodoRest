package com.todoAPP.TODOAPP.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class task {
    @Id
    private long id;
    private String title;
    private String discription;
    private boolean isMarked;

    // Default constructor required by JPA
    public task() {
    }

    public task(long id, String title, String discription, boolean isMarked) {
        this.id = id;
        this.title = title;
        this.discription = discription;
        this.isMarked = isMarked;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    public boolean isMarked() {
        return isMarked;
    }
    public void setMarked(boolean isMarked) {
        this.isMarked = isMarked;
    }
}
