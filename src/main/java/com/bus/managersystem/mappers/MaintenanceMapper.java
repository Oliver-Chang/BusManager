package com.bus.managersystem.mappers;

import com.bus.managersystem.models.BusRouteModel;
import com.bus.managersystem.models.MaintenanceModel;
import org.apache.ibatis.annotations.*;

import java.util.List;
/*
    private Long id;
    private String vehicleNumber;
    private String maintenanceReason;
    private String changeUnit;
    private double maintenanceCost;
    private Date maintenanceTime;
 */

public interface MaintenanceMapper {
    @Select("SELECT * FROM maintenances")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "vehicleNumber", column = "vehicle_number"),
            @Result(property = "maintenanceReason", column = "maintenance_reason"),
            @Result(property = "changeUnit", column = "change_unit"),
            @Result(property = "maintenanceCost", column = "maintenance_cost"),
            @Result(property = "maintenanceTime", column = "maintenance_time")
    })
    List<MaintenanceModel> getAll();


    @Select("SELECT * FROM maintenances WHERE id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "vehicleNumber", column = "vehicle_number"),
            @Result(property = "maintenanceReason", column = "maintenance_reason"),
            @Result(property = "changeUnit", column = "change_unit"),
            @Result(property = "maintenanceCost", column = "maintenance_cost"),
            @Result(property = "maintenanceTime", column = "maintenance_time")
    })
    MaintenanceModel getOne(Long id);


    @Insert("INSERT INTO maintenances(id,vehicle_number,maintenance_reason, change_unit,maintenance_cost,maintenance_time) VALUES(#{id}, #{vehicleNumber}, #{maintenanceReason},#{changeUnit},#{maintenanceCost},#{maintenanceTime})")
    Long save(MaintenanceModel maintenance);

    @Update("UPDATE maintenances SET vehicle_number=#{vehicleNumber},maintenance_reason=#{maintenanceReason},change_unit=#{changeUnit},maintenance_cost=#{maintenanceCost},maintenance_time=#{maintenanceTime} WHERE id =#{id}")
    Long modify(MaintenanceModel maintenance);

    @Delete("DELETE FROM maintenances WHERE id =#{id}")
    Long remove(Long id);
}
