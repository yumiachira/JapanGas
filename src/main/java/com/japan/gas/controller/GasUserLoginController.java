package com.japan.gas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GasUserLoginController {

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		// 这里可以添加逻辑来验证用户名和密码
        if (isValidUser(username, password)) {
            // 如果用户验证成功，重定向到主页或其他页面
            return "redirect:/Index"; // 替换为你希望重定向的页面
        } else {
            // 如果用户验证失败，可以将错误信息添加到模型中
            model.addAttribute("errorMessage", "用户名或密码不正确");
            return "portal/GasIndex"; // 返回登录页面
        }
	}
	
	private boolean isValidUser(String username, String password) {
        // 这里是验证用户的逻辑，你可以根据实际情况进行修改
        // 示例：假设用户名是 "user" 密码是 "password"
        return "user".equals(username) && "password".equals(password);
    }
}