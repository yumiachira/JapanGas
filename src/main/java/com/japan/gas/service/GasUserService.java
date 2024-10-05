package com.japan.gas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japan.gas.mapper.GasUserMapper;
import com.japan.gas.model.GasUser;

@Service
public class GasUserService {
    @Autowired
    private GasUserMapper gasUserMapper;

    public List<GasUser> getAllUsers() {
        return gasUserMapper.selectAllUsers();
        
    }
}
