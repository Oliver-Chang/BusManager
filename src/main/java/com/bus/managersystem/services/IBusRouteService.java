package com.bus.managersystem.services;




import com.bus.managersystem.models.BusRouteModel;

import java.util.List;

public interface IBusRouteService {
    List<BusRouteModel> getAllBusRoutes();

    BusRouteModel getOneBusRoute(String routeNumber);

    BusRouteModel add(BusRouteModel busRoute);

    BusRouteModel modify(BusRouteModel busRoute);

    Long remove(String routeNumber);
}
