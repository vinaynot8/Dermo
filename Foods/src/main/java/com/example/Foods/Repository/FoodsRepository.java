package com.example.Foods.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Foods.Model.Foods;


@Repository
public interface FoodsRepository extends JpaRepository<Foods, Integer>  {

}
