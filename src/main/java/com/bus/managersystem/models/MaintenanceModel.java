package com.bus.managersystem.models;


import java.io.Serializable;
import java.sql.Date;


public class MaintenanceModel implements Serializable {
    private Long id;
    private String vehicleNumber;
    private String maintenanceReason;
    private String changeUnit;
    private double maintenanceCost;
    private Date maintenanceTime;

    public MaintenanceModel() {
        super();
    }

    public MaintenanceModel(Long id, String vehicleNumber, String maintenanceReason, String changeUnit, double maintenanceCost, Date maintenanceTime) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.maintenanceReason = maintenanceReason;
        this.changeUnit = changeUnit;
        this.maintenanceCost = maintenanceCost;
        this.maintenanceTime = maintenanceTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getMaintenanceReason() {
        return maintenanceReason;
    }

    public void setMaintenanceReason(String maintenanceReason) {
        this.maintenanceReason = maintenanceReason;
    }

    public String getChangeUnit() {
        return changeUnit;
    }

    public void setChangeUnit(String changeUnit) {
        this.changeUnit = changeUnit;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
