package com.example.todolist.model;

public class ToDoModel {
    public String task;
    private int id , status;

    public String getTask() {
        return task;
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }
}





