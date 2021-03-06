package com.GrowHub.Server.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "text_contents")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TextContent {

//    @JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
//    @JsonSubTypes({
//            @JsonSubTypes.Type(value = Knowhow.class, name = "knowHow"),
//            @JsonSubTypes.Type(value = Job.class, name = "job")
//    })

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String date;

    @Column
    private String title;

    @Column
    private String body;

    //CONSTRUCTOR
    public TextContent(String date, String title, String body) {
        this.date = date;
        this.title = title;
        this.body = body;
    }

    public TextContent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
