package com.company;

abstract class vehicle {

    private int modelNumber;
    private String enginetype;
    private String enginepower;
    private int tiresize;
    private String vehicleType;

    void setModelNumber(int modelNumber) {
        this.modelNumber=modelNumber;
    }

    void setEnginetype(String enginetype) {
        this.enginetype=enginetype;
    }

    void setEnginepower(String enginepower) {
        this.enginepower=enginepower;
    }

    void setTiresize(int tiresize) {
        this.tiresize=tiresize;
    }

    void setVehicleType(String vehicleType) {
        this.vehicleType=vehicleType;
    }

    int getModelNumber(){
        return modelNumber;
    }
    String getEnginetype(){
        return enginetype;
    }
    String getEnginepower() {
        return enginepower;
    }

    int getTiresize() {
        return tiresize;
    }
    String getVehicleType(){
        return vehicleType;
    }
}
