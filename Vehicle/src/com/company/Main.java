package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        System.out.println("Enter test case: ");
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        input.nextLine();
        while (testCase > 0) {
            System.out.println("Press 1 to add a vehicle and press 2 to delete a vehicle: ");
            int operationType = input.nextInt();
            input.nextLine();
            if(operationType == 1) {
                String type = input.nextLine();
                vehicle Vehicle = showroom.ordervehicle(type);
                showroom.Addtoshowroom(Vehicle.getModelNumber(), Vehicle);
            }else if(operationType == 2) {
                int modelNumber = input.nextInt();
                if (showroom.deleteFromShowroom(modelNumber) == null) {
                    System.out.println("Warning!! There is no vehicles of this model number.");
                } else {
                    System.out.println("Bingo! Delete Successful.");
                }
            }
            showroom.getDetails();
            testCase--;
        }
    }
}
