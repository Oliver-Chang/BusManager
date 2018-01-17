package com.bus.managersystem.models;

import java.io.Serializable;
import java.sql.Date;


public class BusModel implements Serializable {
    private String licensePlate;
    private String vehicleNumber;
    private String brand;
    private String modelNumber;
    private Date purchaseTime;
    private String routeNumber;


    public BusModel() {
        super();
    }

    public BusModel(String licensePlate, String vehicleNumber, String brand, String modelNumber, Date purchaseTime, String routeNumber) {
        super();
        this.licensePlate = licensePlate;
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.purchaseTime = purchaseTime;
        this.routeNumber = routeNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }


    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }
}
