package com.sqisoft.tarottarot.user.controller;

import com.sqisoft.tarottarot.user.entity.userEntity;
import com.sqisoft.tarottarot.user.repository.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {
    @Autowired
    private userRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "userCheck";
    }

    @PostMapping("/login")
    public String login(Model model, String userId, String userPassword) {
        userEntity userEntity = this.userRepository.findUser(userId, userPassword);
        model.addAttribute("user", userEntity);
        if(userEntity != null) {
            return "loginSuccess";
        }else {
            return "loginFail";
        }
    }
}
