package com.japan.gas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.japan.gas.service.GasUserService;

@Controller
@RequestMapping("/users")
public class GasUserController {
	@Autowired
    private GasUserService gasuserService;

    @GetMapping
    public String getAllUsers(Model model) {
    	model.addAttribute("name", "Onanis");
        return "portal/GasIndex";
    }
}
