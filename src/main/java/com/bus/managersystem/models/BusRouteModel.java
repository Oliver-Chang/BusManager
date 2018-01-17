package com.bus.managersystem.models;

import java.io.Serializable;
import java.sql.Date;


public class BusRouteModel implements Serializable {
    private String routeNumber;
    private Date firstDepartureTime;
    private Date lastDepartureTime;
    private String passStation;
    private Date createTime;

    public BusRouteModel() {
        super();
    }

    public BusRouteModel(String routeNumber, Date firstDepartureTime, Date lastDepartureTime, String passStation, Date createTime) {
        super();
        this.routeNumber = routeNumber;
        this.firstDepartureTime = firstDepartureTime;
        this.lastDepartureTime = lastDepartureTime;
        this.passStation = passStation;
        this.createTime = createTime;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public Date getFirstDepartureTime() {
        return firstDepartureTime;
    }

    public void setFirstDepartureTime(Date firstDepartureTime) {
        this.firstDepartureTime = firstDepartureTime;
    }

    public Date getLastDepartureTime() {
        return lastDepartureTime;
    }

    public void setLastDepartureTime(Date lastDepartureTime) {
        this.lastDepartureTime = lastDepartureTime;
    }

    public String getPassStation() {
        return passStation;
    }

    public void setPassStation(String passStation) {
        this.passStation = passStation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
