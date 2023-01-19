package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/print-numbers")

    public String printNumbers(Model model, @RequestParam int n, @RequestParam int m) {

        List<Integer> list = new ArrayList<>();

        for(int i = n; i <= m ; i++) {

            if (i % 2==0){

                list.add(i);
            }
        }

        model.addAttribute("printEven", list);

        return "index";
    }
}