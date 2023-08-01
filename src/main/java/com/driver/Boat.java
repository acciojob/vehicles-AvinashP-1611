package com.driver;

public class Boat implements WaterVehicle{
    private String VehicleName;
    private int VehicleCapacity;

    public Boat() {

    }

    public Boat(String name, int capacity) {
        this.VehicleName = name;
        this.VehicleCapacity = capacity;
    }

    public String getVehicleName() {
        return this.VehicleName;
    }

    public int getVehicleCapacity() {
        return this.VehicleCapacity;
    }
}
