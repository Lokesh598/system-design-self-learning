package org.uber.entity;

public class Vehicle {
    private String driverName;
    private String vehicleName;
    private String vehiclePlateNo;

    public Vehicle() {
    }

    public Vehicle(String driverName, String vehicleName, String vehiclePlateNo) {
        this.driverName = driverName;
        this.vehicleName = vehicleName;
        this.vehiclePlateNo = vehiclePlateNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "driverName='" + driverName + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehiclePlateNo='" + vehiclePlateNo + '\'' +
                '}';
    }
}
