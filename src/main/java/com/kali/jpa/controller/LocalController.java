package com.kali.jpa.controller;

import com.kali.jpa.Entity.Local;
import com.kali.jpa.projection.interfacebased.open.LocalOpenView;
import com.kali.jpa.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/locals")
public class LocalController {

    @Autowired
    LocalService localService;


    // http://localhost:8081/api/locals
    @GetMapping("/findAll")
    public List<Local>findAll(){
        return localService.findAll();
    }



    // Open View
    @GetMapping("/findAllOpenView")
    public List<LocalOpenView>findBy(){
        return localService.findBy();
    }
}
