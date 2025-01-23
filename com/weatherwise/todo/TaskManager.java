package com.weatherwise.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
