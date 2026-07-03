package com.example.todo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;

    public Todo(String title) {

        this.title = title;
        this.completed = false;
    }

    public Todo() {


    }

    public Long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public boolean isCompleted() {

        return completed;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setCompleted(boolean completed) {

        this.completed = completed;
    }

}
