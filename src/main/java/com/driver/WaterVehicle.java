package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat implements WaterVehicle{
    String name;
    int capacity;
    public Boat(String name,int capacity){
        this.capacity=capacity;
        this.name=name;
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }
}
