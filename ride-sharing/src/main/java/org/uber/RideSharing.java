package org.uber;

import org.uber.controller.RideController;
import org.uber.controller.UserController;
import org.uber.controller.VehicleController;
import org.uber.excption.ArrayOutOfBound;
import org.uber.repository.RideRepository;
import org.uber.repository.UserRepository;
import org.uber.repository.VehicleRepository;

import java.util.Map;
import java.util.Scanner;


public class RideSharing {
    //step 1: onboard user and vehicle
    //step 2: offer rides
    //step 3: find rides
    public static void main(String[] args) throws ArrayOutOfBound {
        UserController userController = new UserController();
        VehicleController vehicleController = new VehicleController();
        RideController rideController = new RideController();
        Scanner sc = new Scanner(System.in);
        userController.setUserRepository(new UserRepository());
        vehicleController.setVehicleRepository(new VehicleRepository());
        rideController.setRideRepository(new RideRepository());
        while (true) {
            //user
            System.out.println("Onboard users: ");
            for (int i = 0; i < 4; i++) {
                String userInput = sc.nextLine();
                userController.onboardUser(userInput);
            }
            userController.getUserRepository().getUserList().stream().toList().forEach(System.out::println);
            //car
            System.out.println("Register Users cars: ");
            for (int i = 0; i < 2; i++) {
                String userVehicle = sc.nextLine();
                vehicleController.addVehicle(userVehicle);
            }
            vehicleController.getVehicleRepository().getUserVehicle().stream().toList().forEach(System.out::println);
            // offer ride
            System.out.println("Offer rides: ");
            for (int i = 0; i < 2; i++) {
                String ride = sc.nextLine();
                rideController.offerRide(ride);
            }
            rideController.getRideRepository().getUserRideList().stream().toList().forEach(System.out::println);
            // select ride
            System.out.println("Select ride: ");
            for (int i = 0; i < 3; i++) {
                String selectRide = sc.nextLine();
                rideController.selectRide(selectRide);
            }
            //END TASK

            //PRINT STATS
            rideController.printRideStats();
            String endTask = sc.nextLine();
            if (endTask.equals("end-ride"))
                break;
        }
    }
}