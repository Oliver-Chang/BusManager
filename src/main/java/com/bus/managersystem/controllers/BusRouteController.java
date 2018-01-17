package com.bus.managersystem.controllers;


import com.bus.managersystem.dto.Result;
import com.bus.managersystem.models.BusRouteModel;
import com.bus.managersystem.services.servicesImpl.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/api")
@RestController
public class BusRouteController {

    @Autowired
    private BusRouteService busRoute1;

    @GetMapping("/busroutes")
    public Result<List<BusRouteModel>> getBusRoutes(@RequestParam(value = "limit", defaultValue = "10") Integer limit, @RequestParam(value = "offset", defaultValue = "1") Integer offset) {
        List<BusRouteModel> busRoutes = busRoute1.getAllBusRoutes(limit, offset);
        Result<List<BusRouteModel>> res = new Result<List<BusRouteModel>>(busRoutes, true);
        if(busRoutes.isEmpty()) {
            String error = "can not get buses data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @GetMapping("/busroute/{vehicleNumber}")
    public Result<BusRouteModel> getOne(@PathVariable String vehicleNumber) {
        BusRouteModel resRoute = busRoute1.getOneBusRoute(vehicleNumber);
        Result<BusRouteModel> res = new Result<BusRouteModel>(resRoute, true);
        if (resRoute == null){
            String error = "can not get busroute data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @PostMapping("/busroutes")
    public Result<BusRouteModel> createBusRoute(@RequestBody BusRouteModel busRoute){
        BusRouteModel resRoute=busRoute1.add(busRoute);
        Result<BusRouteModel> res = new Result<BusRouteModel>(resRoute, true);
        if (resRoute == null){
            String error = "can not create busroute data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @PutMapping("/busroute")
    public Result<BusRouteModel> modifyBusRoute(@RequestBody BusRouteModel busRoute){
        BusRouteModel resRoute=busRoute1.modify(busRoute);
        Result<BusRouteModel> res = new Result<BusRouteModel>(resRoute, true);
        if (resRoute == null){
            String error = "can not modify busroute data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @DeleteMapping("/busroute/{routeNumber}")
    public Result<Long> remove(@PathVariable String routeNumber){
        long retCode=busRoute1.remove(routeNumber);
        Result<Long> res = new Result<Long>(retCode, true);
        if (retCode == 0) {
            String error = "can not remove busroute data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }


}
