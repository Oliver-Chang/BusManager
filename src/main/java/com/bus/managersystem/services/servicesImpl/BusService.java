package com.bus.managersystem.services.servicesImpl;

import com.bus.managersystem.mappers.BusMapper;
import com.bus.managersystem.models.BusModel;
import com.bus.managersystem.services.IBusService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusService implements IBusService {

    @Autowired
    private BusMapper busMapper;

    @Override
    public List<BusModel> getAllBuses() {
        List<BusModel> buses = busMapper.getAll();
        return buses;
    }

    public List<BusModel> getAllBuses(Integer limit, Integer offset) {
        PageHelper.startPage(offset, limit);
        List<BusModel> buses = busMapper.getAll();
        return buses;
    }

    @Override
    public BusModel getOneBus(String vehicleNumber) {
        BusModel bus = busMapper.getOne(vehicleNumber);
        return bus;
    }

    @Override
    public BusModel add(BusModel bus) {
        Long retCode = busMapper.save(bus);
        if (retCode == 0) {
            bus = null;
        }
        return bus;
    }

    @Override
    public BusModel modify(BusModel bus) {
        Long retCode = busMapper.modify(bus);
        if (retCode == 0) {
            bus = null;
        }
        return bus;
    }

    @Override
    public Long remove(String vehicleNumber) {
        Long retCode = busMapper.remove(vehicleNumber);
        return retCode;
    }
}
