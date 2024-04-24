package org.uber.repository;

import org.uber.entity.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {
    public List<Ride> rideList;

    public RideRepository() {
        rideList = new ArrayList<Ride>();
    }
    public void addUserRide(Ride ride) {
        rideList.add(ride);
    }

    public List<Ride> getUserRideList() {
        return rideList;
    }
}
