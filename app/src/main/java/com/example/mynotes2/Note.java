package com.example.mynotes2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {

    private int id;
    private String name;
    private String content;
    private LocalDateTime creatnData;
    private LocalDateTime updateDate;

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Note(int id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.creatnData = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationData() {
        return creatnData;
    }

    public void setCreationData(LocalDateTime creationData) {
        this.creatnData = creationData;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Note() {
        super();
    }


    @NonNull
    @Override
    public String toString() {
       return +id +
                " | " + name +
                " | " + content +
                " | " + creatnData.format(formatter) +
                " | " + updateDate.format(formatter);


    }


}
