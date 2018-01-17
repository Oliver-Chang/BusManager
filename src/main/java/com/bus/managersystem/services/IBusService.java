package com.bus.managersystem.services;

import com.bus.managersystem.models.BusModel;

import java.util.List;

public interface IBusService {
    List<BusModel> getAllBuses();

    BusModel getOneBus(String vehicleNumber);

    BusModel add(BusModel bus);

    BusModel modify(BusModel bus);

    Long remove(String vehicleNumber);
}
