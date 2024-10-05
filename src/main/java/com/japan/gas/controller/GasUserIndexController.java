package com.japan.gas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.japan.gas.service.GasUserService;

@Controller
@RequestMapping("/Index")
public class GasUserIndexController {

    @GetMapping
    public String getAllUsers(Model model) {
        return "portal/Index";
    }
}