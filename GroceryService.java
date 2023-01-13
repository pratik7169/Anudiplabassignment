package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.Model.Grocery;
@Service
public interface GroceryService {

Grocery createGrocery(Grocery grocery);
public Grocery saveGroceryk(Grocery grocery);
public Grocery findByGroceryId(Long id);

	List<Grocery> findAllGrocery();
	void deleteGrocery(Long id);
	Grocery updateGrocery(Grocery grocery);
	
	
}