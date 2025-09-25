package org.example;

public class Airplane {
    private String model;
    private String tailNumber;
    private int capacity;

    public Airplane(String model, String tailNumber, int capacity){
        this.model = model;
        this.tailNumber = tailNumber;
        this.capacity = capacity;
    }
    public String getModel() {
        return model;
    }

    public String getTailNumber(){
        return tailNumber;
    }

    public int getCapacity(){
        return capacity;
    }
}
