package org.uber.controller;

import org.uber.entity.Ride;
import org.uber.repository.RideRepository;

import java.util.HashMap;
import java.util.Map;

public class RideController {

    Map<String, Integer> rideOffer;
    Map<String, Integer> rideTaken;

    Ride ride;
    RideRepository rideRepository;

    public RideRepository getRideRepository() {
        return rideRepository;
    }
    public void setRideRepository(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public void offerRide(String rideInput) {
        String[] rideString = rideInput.split(" ");
        rideOffer = new HashMap<>();
        ride = new Ride();
        ride.setUserName(rideString[0]);
        ride.setOrigin(rideString[1]);
        ride.setAvailableSeats(Integer.parseInt(rideString[2]));
        ride.setVehicleName(rideString[3]);
        ride.setVehiclePlateNo(rideString[4]);
        ride.setDestination(rideString[5]);

        rideOffer.put(ride.getUserName(), ride.getAvailableSeats());
        rideRepository.addUserRide(ride);
    }

//    Rohan M 36
//    Shashank M 29
//    Nandini F 29
//    Shipra F 27
//
//    Rohan Swift KA-01-12345
//    Shashank Baleno TS-05-62395
//    Rohan Hyderabad 1 Swift KA-01-12345 Bangalore
//    Shipra Bangalore 2 Activa KA-12-12332 Mysore
//
//    Nandini Bangalore Mysore 1
//    Gaurav Bangalore Mysore 1
//    Rohan Hyderabad Bangalore 1
//Shyam Hyderabad Bangalore 1

    //for select ride
    public void selectRide(String selectRide) {
        rideTaken = new HashMap<>();
        String[] rideSelect = selectRide.split(" ");
            String passenger = rideSelect[0];
            String origin = rideSelect[1];
            String destination = rideSelect[2];
            int seats = Integer.parseInt(rideSelect[3]);

            try {
                for (Ride userRide : rideRepository.rideList) {
                    if (userRide.getOrigin().equals(origin) && userRide.getDestination().equals(destination) && userRide.getAvailableSeats() != 0) {
                        userRide.setAvailableSeats(userRide.getAvailableSeats() - seats);
                        System.out.println("Booked seat for " + passenger + "!!");
                        rideTaken.put(passenger, seats);
                        break;
                    } else {
                        System.out.println("No rides found");
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    public void printRideStats() {
        for (Map.Entry<String, Integer> entry : rideTaken.entrySet()) {
            String user = entry.getKey();
            int ridesTakenCount = entry.getValue();
            int ridesOfferedCount = rideOffer.getOrDefault(user, 0); // GetOrDefault handles cases where user is not in ridesOffered
            System.out.println(user + ": " + ridesTakenCount + " Taken, " + ridesOfferedCount + " Offered");
        }
    }
}
