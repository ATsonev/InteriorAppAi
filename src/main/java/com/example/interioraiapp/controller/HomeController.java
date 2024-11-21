package com.example.interioraiapp.controller;

import com.example.interioraiapp.model.SetupDto;
import com.example.interioraiapp.service.FurnitureService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController{

    public final FurnitureService furnitureService;

    public HomeController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/setup")
    public String builder(Model model){
        model.addAttribute("furnitureDto", new SetupDto());
        return "setup";
    }

    @PostMapping("/setup")
    public String getSetup(@Valid @ModelAttribute SetupDto furnitureDto){
        return "redirect:/setup";
    }

}
