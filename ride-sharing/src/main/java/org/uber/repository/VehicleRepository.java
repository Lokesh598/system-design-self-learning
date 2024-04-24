package org.uber.repository;

import org.uber.entity.User;
import org.uber.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private List<Vehicle> userVehicle;

    public VehicleRepository() {
        userVehicle = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        userVehicle.add(vehicle);
    }

    public List<Vehicle> getUserVehicle() {
        return userVehicle;
    }
}
