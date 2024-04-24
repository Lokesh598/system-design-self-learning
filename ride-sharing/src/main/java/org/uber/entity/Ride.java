package org.uber.entity;

public class Ride {
//    offer_ride(“Rohan, Origin=Hyderabad, Available Seats=1, Vehicle=Swift, KA-01-12345, Destination= Bangalore”)
    private String userName;
    private String origin;
    private int availableSeats;
    private String vehicleName;
    private String vehiclePlateNo;
    private String destination;

    public Ride() {
    }

    public Ride(String userName, String origin, int availableSeats, String vehicleName, String vehiclePlateNo, String destination) {
        this.userName = userName;
        this.origin = origin;
        this.availableSeats = availableSeats;
        this.vehicleName = vehicleName;
        this.vehiclePlateNo = vehiclePlateNo;
        this.destination = destination;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehiclePlateNo() {
        return vehiclePlateNo;
    }

    public void setVehiclePlateNo(String vehiclePlateNo) {
        this.vehiclePlateNo = vehiclePlateNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "userName='" + userName + '\'' +
                ", origin='" + origin + '\'' +
                ", availableSeats=" + availableSeats +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehiclePlateNo='" + vehiclePlateNo + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
