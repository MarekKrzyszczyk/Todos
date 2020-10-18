package com.mkrzyszczyk.rest.webservices.restfulwebservices.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private boolean isDone;

    @Column
    private LocalDate targetDate;

    @Column
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Todo(Long id, String description, boolean isDone, LocalDate targetDate, String username) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
        this.targetDate = targetDate;
        this.username = username;
    }

    public Todo() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
