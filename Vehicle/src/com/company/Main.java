package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        System.out.println("Enter test case: ");
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase > 0) {
            input.nextLine();
            System.out.println("Press 1 to add a vehicle and press 2 to delete a vehicle: ");
            int operationType = input.nextInt();
            if(operationType == 1) {
                String type = input.nextLine();
                vehicle Vehicle = showroom.ordervehicle(type);
                showroom.Addtoshowroom(Vehicle.getModelNumber(), Vehicle);
                showroom.getDetails();
            }else {
                int modelNumber = input.nextInt();
                if (showroom.Deletetoshowroom(modelNumber) == null) {
                    System.out.println("Warning!! There is no vehicles of this model number.");
                } else {
                    System.out.println("Bingo! Delete Successful.");
                }
                showroom.getDetails();
                showroom.deleteFromShowroom(modelNumber);
            }
            testCase--;
        }
    }
}
