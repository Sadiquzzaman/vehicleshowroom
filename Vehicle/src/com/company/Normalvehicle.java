package com.company;

public class  Normalvehicle extends vehicle {
        public Normalvehicle(int modelNumber, String enginetype, String enginepower, int tiresize) {
        super.setModelNumber(modelNumber);
        super.setEnginetype(enginetype);
        super.setEnginepower(enginepower);
        super.setTiresize(tiresize);
        super.setVehicleType("Normal");
    }
}
