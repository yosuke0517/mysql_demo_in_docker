package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        return "login";

    }
}
