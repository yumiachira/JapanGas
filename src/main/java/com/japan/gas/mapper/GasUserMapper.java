package com.japan.gas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.japan.gas.model.GasUser;

@Mapper
public interface GasUserMapper {
    List<GasUser> selectAllUsers();
}