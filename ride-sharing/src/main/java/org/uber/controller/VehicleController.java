package org.uber.controller;


import org.uber.entity.Vehicle;
import org.uber.repository.VehicleRepository;

import java.util.ArrayList;
import java.util.List;

public class VehicleController {
    Vehicle vehicle;
    VehicleRepository vehicleRepository;

    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }
    public void setVehicleRepository(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public void addVehicle(String vehicleInput) {
        String[] vehicleString = vehicleInput.split(" ");
        vehicle = new Vehicle();
        vehicle.setDriverName(vehicleString[0]);
        vehicle.setVehicleName(vehicleString[1]);
        vehicle.setVehiclePlateNo(vehicleString[2]);

        vehicleRepository.addVehicle(vehicle);


    }
}
