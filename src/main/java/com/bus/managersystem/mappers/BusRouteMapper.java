package com.bus.managersystem.mappers;

import com.bus.managersystem.models.BusModel;
import com.bus.managersystem.models.BusRouteModel;
import org.apache.ibatis.annotations.*;

import java.util.List;
/*
    private String routeNumber;
    private Date firstDepartureTime;
    private Date lastDepartureTime;
    private String passStation;
    private Date createTime;
 */

public interface BusRouteMapper {
    @Select("SELECT * FROM bus_routes")
    @Results({
            @Result(property = "routeNumber", column = "route_number"),
            @Result(property = "firstDepartureTime", column = "first_departure_time"),
            @Result(property = "lastDepartureTime", column = "last_departure_time"),
            @Result(property = "passStation", column = "pass_station"),
            @Result(property = "createTime", column = "create_time")
    })
    List<BusRouteModel> getAll();

    @Select("SELECT * FROM bus_routes WHERE route_number= #{routeNumber}")
    @Results({
            @Result(property = "routeNumber", column = "route_number"),
            @Result(property = "firstDepartureTime", column = "first_departure_time"),
            @Result(property = "lastDepartureTime", column = "last_departure_time"),
            @Result(property = "passStation", column = "pass_station"),
            @Result(property = "createTime", column = "create_time")
    })
    BusRouteModel getOne(String routeNumber);

    @Insert("INSERT INTO bus_routes(route_number,first_departure_time,last_departure_time, pass_station,create_time) VALUES(#{routeNumber}, #{firstDepartureTime}, #{lastDepartureTime},#{passStation},#{createTime})")
    Long save(BusRouteModel busRoute);

    @Update("UPDATE bus_routes SET first_departure_time=#{firstDepartureTime},last_departure_time=#{lastDepartureTime},pass_station=#{passStation},create_time=#{createTime} WHERE route_number =#{routeNumber}")
    Long modify(BusRouteModel busRoute);

    @Delete("DELETE FROM bus_routes WHERE route_number =#{routeNumber}")
    Long remove(String routeNumber);

}
