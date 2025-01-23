package com.weatherwise.todo;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private LocalDateTime dueDate;

    public Task(String title, LocalDateTime dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return title + " (Due: " + dueDate + ")";
    }
}
