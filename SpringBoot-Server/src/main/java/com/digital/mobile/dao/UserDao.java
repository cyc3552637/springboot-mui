package com.digital.mobile.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import com.digital.mobile.entity.UserEntity;



@Mapper
public interface UserDao {
	@Insert("insert into userTest (userid,user) values(#{userid},#{user})")
    int register(@Param("userid")String userid,@Param("user")String user);
	
	@Select("select userid,user from userTest")
    List<UserEntity> query();


    
   
}
