package com.example.demo.controller;

import com.example.demo.entity.AccountEntity;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<AccountEntity> emplist=accountRepository.findAll();
        model.addAttribute("emplist", emplist);

        model.addAttribute("message", "Hello Springboot");
        return "index/index";

    }
}
