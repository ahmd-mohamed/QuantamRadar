package com.mycompany.qantamradar;

public class  Violation {
   private String description;
private int amount;

    public Violation() {
    }
    public Violation(String Description, int amount) {
        this.description = Description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "Description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

}
