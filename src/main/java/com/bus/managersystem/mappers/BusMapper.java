package com.bus.managersystem.mappers;

import com.bus.managersystem.models.BusModel;
import org.apache.ibatis.annotations.*;


import java.util.List;


/*
public class BusModel implements Serializable {
    private String licensePlate;
    private String vehicleNumber;
    private String brand;
    private String modelNumber;
    private Date purchaseTime;
    private String routeNumber;
    }
 */

public interface BusMapper {
    @Select("SELECT * FROM buses")
    @Results({
            @Result(property = "licensePlate", column = "license_plate"),
            @Result(property = "vehicleNumber", column = "vehicle_number"),
            @Result(property = "brand", column = "brand"),
            @Result(property = "modelNumber", column = "model_number"),
            @Result(property = "purchaseTime", column = "purchase_time"),
            @Result(property = "routeNumber", column = "route_number")
    })
    List<BusModel> getAll();

    @Select("SELECT * FROM buses WHERE vehicle_number = #{vehicleNumber}")
    @Results({
            @Result(property = "licensePlate", column = "license_plate"),
            @Result(property = "vehicleNumber", column = "vehicle_number"),
            @Result(property = "brand", column = "brand"),
            @Result(property = "modelNumber", column = "model_number"),
            @Result(property = "purchaseTime", column = "purchase_time"),
            @Result(property = "routeNumber", column = "route_number")
    })
    BusModel getOne(String vehicleNumber);

    @Insert("INSERT INTO buses(license_plate,vehicle_number,brand, model_number,purchase_time,route_number) VALUES(#{licensePlate}, #{vehicleNumber}, #{brand},#{modelNumber},#{purchaseTime},#{routeNumber})")
    Long save(BusModel bus);

    @Update("UPDATE buses SET license_plate=#{licensePlate},brand=#{brand},model_number=#{modelNumber},purchase_time=#{purchaseTime},route_number=#{routeNumber} WHERE vehicle_number =#{vehicleNumber}")
    Long modify(BusModel bus);

    @Delete("DELETE FROM buses WHERE vehicle_number =#{vehicleNumber}")
    Long remove(String vehicleNumber);

}
