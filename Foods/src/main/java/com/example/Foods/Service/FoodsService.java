package com.example.Foods.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Foods.Model.Foods;
import com.example.Foods.Repository.FoodsRepository;

@Service
public class FoodsService {
	@Autowired
	FoodsRepository foodsRepository;
	
	public List<Foods> getAllFoodDetails()
	{
		List<Foods> foods=new ArrayList<Foods>();
		return foodsRepository.findAll();	
	}
	public Foods getCarsById(int id)
	{
		return foodsRepository.findById(id).get();
	}
	public Foods saveOrUpdate(Foods foods)
	{
		return foodsRepository.save(foods);
	}
	public void delete(int id)
	{
		foodsRepository.deleteById(id);
	}
	public void saveOrUpdate(Foods foods, int id)
	{
		foodsRepository.save(foods);
	}

}
