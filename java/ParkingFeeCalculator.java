package java;

import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Vehicle type
        System.out.println("Welcome to the Parking System!");
        System.out.print("Enter your vehicle type (Car, Motorcycle, Truck): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        // Parking fee calculation
        int parkingFee;
        if (vehicleType.equals("car")) {
            parkingFee = 50; // Car parking fee
        } else if (vehicleType.equals("motorcycle")) {
            parkingFee = 20; // Motorcycle parking fee
        } else if (vehicleType.equals("truck")) {
            parkingFee = 100; // Truck parking fee
        } else {
            System.out.println("Invalid vehicle type entered.");
            parkingFee = -1; // Indicate an error
        }

        // Output the result
        if (parkingFee != -1) {
            System.out.println("The parking fee for your " + vehicleType + " is: Rs. " + parkingFee);
        }

        scanner.close();
    }
}
