package com.company;

public abstract class vehiclefactory {
    public vehicle ordervehicle(String vehicletype) {

        vehicle Vehicle = createvehicle(vehicletype);
        return Vehicle;
    }
    abstract vehicle createvehicle(String vehicletype);
}
