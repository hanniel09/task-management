package com.hanniel.todolist.Dtos;

public class UserRelationShipRequest {
    private long taskId;

    public long getTaskId(){
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }
}
