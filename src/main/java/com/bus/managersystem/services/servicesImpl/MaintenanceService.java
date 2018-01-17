package com.bus.managersystem.services.servicesImpl;

import com.bus.managersystem.mappers.MaintenanceMapper;
import com.bus.managersystem.models.MaintenanceModel;
import com.bus.managersystem.services.IMaintenanceService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService implements IMaintenanceService {

    @Autowired
    private MaintenanceMapper Maintenancemapper;

    @Override
    public List<MaintenanceModel> getAllMaintenances() {
        List<MaintenanceModel> maintenance=Maintenancemapper.getAll();
        return maintenance;
    }


    public List<MaintenanceModel> getAllMaintenances(Integer limit, Integer offset) {
        PageHelper.startPage(offset, limit);
        List<MaintenanceModel> maintenance=Maintenancemapper.getAll();
        return maintenance;
    }

    @Override
    public MaintenanceModel getOneMaintenance(Long id) {
        MaintenanceModel maintenance=Maintenancemapper.getOne(id);
        return maintenance;
    }

    @Override
    public MaintenanceModel add(MaintenanceModel maintenance) {
        long id = Maintenancemapper.save(maintenance);
        if(id == 0)
            maintenance=null;
        return maintenance;
    }

    @Override
    public MaintenanceModel modify(MaintenanceModel maintenance) {
        long retcode=Maintenancemapper.modify(maintenance);
        if(retcode ==0)
            maintenance=null;
        return maintenance;
    }

    @Override
    public Long remove(Long id) {
        long retcode=Maintenancemapper.remove(id);
        return retcode;
    }
}
