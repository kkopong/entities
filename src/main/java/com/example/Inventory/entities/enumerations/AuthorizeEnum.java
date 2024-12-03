package com.example.Inventory.entities.enumerations;

public enum AuthorizeEnum {
    DECLINE("Request has been Declined"),
    ACCEPT("Request has been Declined");
    private final String description;

    AuthorizeEnum(String description) {
        this.description = description;
    }

//    public String getDescription() {
//        return description;
//    }

    public boolean isFinalStatus() {
        return this == ACCEPT;
    }

    public boolean FinalStatus() {
        return this == DECLINE;
    }


}
