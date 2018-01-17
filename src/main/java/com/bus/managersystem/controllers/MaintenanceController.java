package com.bus.managersystem.controllers;

import com.bus.managersystem.dto.Result;
import com.bus.managersystem.models.BusModel;
import com.bus.managersystem.models.BusRouteModel;
import com.bus.managersystem.models.MaintenanceModel;
import com.bus.managersystem.services.servicesImpl.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


//@RequestMapping("/api")
@RestController
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("/maintenances")
    public Result<List<MaintenanceModel>> getMaintenances(@RequestParam(value = "limit", defaultValue = "10") Integer limit, @RequestParam(value = "offset", defaultValue = "1") Integer offset) {
        List<MaintenanceModel> maintenances = maintenanceService.getAllMaintenances(limit, offset);
        Result<List<MaintenanceModel>> res = new Result<List<MaintenanceModel>>(maintenances, true);
        if(maintenances.isEmpty()) {
            String error = "can not get maintenances data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @GetMapping("/maintenance/{id}")
    public Result<MaintenanceModel> getOne(@PathVariable long id) {
        MaintenanceModel maintenances = maintenanceService.getOneMaintenance(id);
        Result<MaintenanceModel> res = new Result<MaintenanceModel>(maintenances, true);
        if (maintenances == null){
            String error = "can not get maintenance data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
    @PostMapping("/maintenance")
    public Result<MaintenanceModel> createMaintenance(@RequestBody MaintenanceModel maintenance){
        MaintenanceModel resMaintenance=maintenanceService.add(maintenance);
        Result<MaintenanceModel> res = new Result<MaintenanceModel>(resMaintenance, true);
        if (resMaintenance == null){
            String error = "can not create maintenance data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }

    @PutMapping("/maintenance")
    public Result<MaintenanceModel> modifyMaintenance(@RequestBody MaintenanceModel maintenance) {
        MaintenanceModel retMaintenance =  maintenanceService.modify(maintenance);
        Result<MaintenanceModel> res = new Result<MaintenanceModel>(retMaintenance, true);
        if (retMaintenance == null) {
            String error = "can not modify maintenance data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }

    @DeleteMapping("/maintenance/{id}")
    public Result<Long> removeMaintenance(@PathVariable Long id) {
        Long retCode =  maintenanceService.remove(id);
        Result<Long> res = new Result<Long>(retCode, true);
        if (retCode == 0) {
            String error = "can not remove maintenance data";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
}
