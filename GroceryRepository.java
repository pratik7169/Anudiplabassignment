package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Model.Grocery;

public interface GroceryRepository extends CrudRepository<Grocery,Long> {

}
