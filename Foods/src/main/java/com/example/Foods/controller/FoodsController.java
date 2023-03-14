package com.example.Foods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Foods.Model.Foods;
import com.example.Foods.Service.FoodsService;

@RestController
public class FoodsController {
    @Autowired
	FoodsService foodsService;
    
    @GetMapping("/foods")
    public List<Foods> getAllFoodDetails()
    {
		return foodsService.getAllFoodDetails();	
    }
    @GetMapping("/foods/{id}")
    public Foods getCarsById(@PathVariable("id") int id)
    {
		return foodsService.getCarsById(id);
    }
    @DeleteMapping("/foods/{id}")
    public List<Foods> deleteById(@PathVariable("id") int id)
    {
    	foodsService.delete(id);
		return foodsService.getAllFoodDetails();
    }
    @PostMapping("/foodadd")
    public List<Foods> save(@RequestBody Foods foods)
    {
    	foodsService.saveOrUpdate(foods);
		return foodsService.getAllFoodDetails();
    }
    @PutMapping("/foodupdate")
    public List<Foods> update(@RequestBody Foods foods, int id)
    {
    	foodsService.saveOrUpdate(foods, id);
		return foodsService.getAllFoodDetails();
    }	
}
