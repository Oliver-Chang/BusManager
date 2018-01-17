package com.bus.managersystem.mappers;

import com.bus.managersystem.models.UserModel;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Select("SELECT * FROM user WHERE id = #{id} and pwd=#{passWord}")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "passWord", column = "pwd"),
        @Result(property = "userName", column = "name"),
    })
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Long getUser(UserModel user);
}
