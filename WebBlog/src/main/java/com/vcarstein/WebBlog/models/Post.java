package com.vcarstein.WebBlog.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String announcement;

    @Column(name = "full_text")
    private String fullText;

    private int views;

    public Post() {
    }

    public Post(String title, String announcement, String fullText) {
        this.title = title;
        this.announcement = announcement;
        this.fullText = fullText;
    }
}
