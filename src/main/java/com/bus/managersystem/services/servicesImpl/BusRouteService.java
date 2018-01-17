package com.bus.managersystem.services.servicesImpl;

import com.bus.managersystem.mappers.BusRouteMapper;
import com.bus.managersystem.models.BusRouteModel;
import com.bus.managersystem.services.IBusRouteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusRouteService implements IBusRouteService {

    @Autowired
    private BusRouteMapper busRouteMapper;

    @Override
    public List<BusRouteModel> getAllBusRoutes() {
        List<BusRouteModel> busRoute=busRouteMapper.getAll();
        return busRoute;
    }


    public List<BusRouteModel> getAllBusRoutes(Integer limit, Integer offset) {
        PageHelper.startPage(offset, limit);
        List<BusRouteModel> busRoute=busRouteMapper.getAll();
        return busRoute;
    }

    @Override
    public BusRouteModel getOneBusRoute(String routeNumber) {
        BusRouteModel busRoute=busRouteMapper.getOne(routeNumber);
        return busRoute;
    }

    @Override
    public BusRouteModel add(BusRouteModel busRoute) {
        Long retCode = busRouteMapper.save(busRoute);
        if(retCode == 0)
            busRoute=null;
        return busRoute;
    }

    @Override
    public BusRouteModel modify(BusRouteModel busRoute) {
        long retCode=busRouteMapper.modify(busRoute);
        if(retCode == 0)
            busRoute=null;
        return busRoute;
    }

    @Override
    public Long remove(String routeNumber) {
        long retCode=busRouteMapper.remove(routeNumber);
        return retCode;
    }
}
