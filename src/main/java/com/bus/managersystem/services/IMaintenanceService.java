package com.bus.managersystem.services;


import com.bus.managersystem.models.MaintenanceModel;

import java.util.List;

public interface IMaintenanceService {
    List<MaintenanceModel> getAllMaintenances();

    MaintenanceModel getOneMaintenance(Long id);

    MaintenanceModel add(MaintenanceModel maintenance);

    MaintenanceModel modify(MaintenanceModel maintenance);

    Long remove(Long id);
}
