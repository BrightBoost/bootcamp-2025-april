package com.example.firstapp.controller;


import com.example.firstapp.dao.CityDao;
import com.example.firstapp.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private CityDao cityDao;

    @Autowired
    public CityController(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    // get endpoint - url/hi
    @GetMapping("hi")
    public String quickExample() {
        return "Helllloooo!!!!";
    }

    @GetMapping("hi/{name}")
    public String quickPersonalizedExample(@PathVariable String name) {
        return "Hii " + name;
    }

    @GetMapping("cities")
    public List<City> getCities(@RequestParam(required = false) String search) {
        if(search != null) {
            return cityDao.getAllCitiesContaining(search);
        } else {
            return cityDao.getAllCities();
        }
    }


}
