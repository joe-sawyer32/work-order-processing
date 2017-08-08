package com.theironyard;

/**
 * Created by Joe on 7/27/17.
 */
public class WorkOrder {
    // FIELDS
    private int id;
    private String description;
    private String senderName;
    private Status status;

    // CONSTRUCTORS

    public WorkOrder() {
    }

    // METHODS
    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // custom

    @Override
    public String toString() {
        return "\n-------------------------------" +
                "\nWorkOrder - Id#" + id +
                "\n-------------------------------" +
                "\nDescription - " + description +
                "\nSender - " + senderName +
                "\nStatus - " + status +
                "\n-------------------------------\n";
    }
}
