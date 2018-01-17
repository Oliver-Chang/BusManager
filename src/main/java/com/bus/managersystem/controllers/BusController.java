package com.bus.managersystem.controllers;


import com.bus.managersystem.dto.Result;
import com.bus.managersystem.models.BusModel;
import com.bus.managersystem.services.servicesImpl.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//@RequestMapping("/api")
@RestController
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping("/buses")
    public Result<List<BusModel>> getBuses(@RequestParam(value = "limit", defaultValue = "10") Integer limit, @RequestParam(value = "offset", defaultValue = "1") Integer offset) {
        List<BusModel> buses = busService.getAllBuses(limit, offset);
        Result<List<BusModel>> res = new Result<List<BusModel>>(buses, true);
        if(buses.isEmpty()) {
            String error = "can not get buses data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }

    @GetMapping("/bus/{vehicleNumber}")
    public Result<BusModel> getOne(@PathVariable String vehicleNumber) {
        BusModel bus = busService.getOneBus(vehicleNumber);
        Result<BusModel> res = new Result<BusModel>(bus, true);
        if (bus == null){
            String error = "can not get bus data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @PostMapping("/bus")
    public Result<BusModel> createBus(@RequestBody BusModel bus) {
        BusModel retBus =  busService.add(bus);
        Result<BusModel> res = new Result<BusModel>(bus, true);
        if (bus == null) {
            String error = "can not create bus data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }

    @PutMapping("/bus")
    public Result<BusModel> modifyBus(@RequestBody BusModel bus) {
        BusModel retBus =  busService.modify(bus);
        Result<BusModel> res = new Result<BusModel>(bus, true);
        if (bus == null) {
            String error = "can not modify bus data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }

    @DeleteMapping("/bus/{vehicleNumber}")
    public Result<Long> removeBus(@PathVariable String vehicleNumber) {
        Long retCode =  busService.remove(vehicleNumber);
        Result<Long> res = new Result<Long>(retCode, true);
        if (retCode == 0) {
            String error = "can not remove bus data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
}
