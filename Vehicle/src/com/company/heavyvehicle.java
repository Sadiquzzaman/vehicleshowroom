package com.company;

public class heavyvehicle extends vehicle {
        public heavyvehicle(int modelNumber, int tiresize){
        super.setModelNumber(modelNumber);
        super.setEnginetype("diesel");
        super.setEnginepower("weight");
        super.setTiresize(tiresize);
        super.setVehicleType("Heavy");
    }
}
