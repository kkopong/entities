package com.example.Inventory.entities.enumerations;

public enum StatusEnum {
    NEW("New task, not yet started"),
    IN_PROGRESS("Task is currently in progress"),
    COMPLETED("Task has been completed"),
    ON_HOLD("Task is temporarily on hold");

    private final String description;

    StatusEnum(String description) {
        this.description = description;
    }

//    public String getDescription() {
//        return description;
//    }

    public boolean isFinalStatus() {
        return this == COMPLETED;
    }


}
