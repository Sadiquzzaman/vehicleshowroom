package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Showroom extends vehiclefactory {

    @Override
    vehicle createvehicle(String vehicletype) {
        if(vehicletype.equals("normal")){
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a model number for a normal vehicle: ");
            int modelNumber = input.nextInt();
            input.nextLine();
            System.out.println("Enter a enginetype for a normal vehicle: ");
            String engineType = input.nextLine();
            System.out.println("Enter enginepower for a normal vehicle: ");
            String enginePower = input.nextLine();
            System.out.println("Enter tiresize of a normal vehicle: ");
            int tiresize = input.nextInt();
            return new Normalvehicle(modelNumber,engineType,enginePower,tiresize);
        }else if(vehicletype.equals("sports")){
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a model number for a sports vehicle: ");
            int modelNumber = input.nextInt();
            System.out.println("Enter tiresize of a sports vehicle: ");
            int tiresize = input.nextInt();
            expectedVisitor+=20;
            return new sportsvehicle(modelNumber,tiresize);
        }else if(vehicletype.equals("heavy")){
            Scanner input =new Scanner((System.in));
            System.out.println("Enter a model number for a heavy vehicle: ");
            int modelNumber = input.nextInt();
            System.out.println("Enter tiresize of a heavy vehicle: ");
            int tiresize = input.nextInt();
            return new heavyvehicle(modelNumber,tiresize);
        }else{
            return null;
        }
    }
        HashMap<Integer, vehicle> map = new HashMap<>();
        private static Integer expectedVisitor = 30;
        void Addtoshowroom(int modelNumber, vehicle Vehicle){
            map.put(modelNumber,Vehicle);
        }
        void getDetails(){
            for (Map.Entry<Integer, vehicle> entry : map.entrySet()) {
                System.out.println("Model Number: " + entry.getKey() + "\n" );
                System.out.println("Engine Type: " + entry.getValue().getEnginetype() + "\n");
                System.out.println("Engine Power: " + entry.getValue().getEnginepower() + "\n");
                System.out.println("Tire Size: " + entry.getValue().getTiresize() + "\n");
                System.out.println("Vehicle Type: " + entry.getValue().getVehicleType() + "\n");
            }

            System.out.println("Expected Visitors: " + expectedVisitor + "\n\n");

        }
        vehicle deleteFromShowroom(Integer modelNumber){
            vehicle Vehicle= map.get(modelNumber);

            if(Vehicle==null){
                return null;
            }
            else{

                if(Vehicle.getVehicleType().equals("sports")){
                    if(expectedVisitor>=50){
                        expectedVisitor -= 20;
                    }
                }

                return map.remove(modelNumber);
            }
        }
}
