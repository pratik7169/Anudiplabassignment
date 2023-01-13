package com.example.Service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Grocery;
import com.example.Repository.GroceryRepository;
import com.example.Service.GroceryService;
@Service
public class GroceryServiceImpl implements GroceryService{
	@Autowired  //(required=true)
	private GroceryRepository groceryRepository;
	@Override
	public Grocery createGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return groceryRepository.save(grocery);
	}

	@Override
	public List<Grocery> findAllGrocery() {
		// TODO Auto-generated method stub
		return (List<Grocery>) groceryRepository.findAll();
	}

	@Override
	public void deleteGrocery(Long id) {
		// TODO Auto-generated method stub
		 groceryRepository.deleteById(id);
	}

	@Override
	public Grocery updateGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		Grocery _grocery=groceryRepository.findById(grocery.getId()).get();
		_grocery.setName(_grocery.getName());
		_grocery.setPrice(_grocery.getPrice());
		_grocery.setQuantity(_grocery.getQuantity());
		return groceryRepository.save(_grocery);
	}

	@Override
	public Grocery saveGroceryk(Grocery grocery) {
		// TODO Auto-generated method stub
		return groceryRepository.save(grocery);
	}

	@Override
	public Grocery findByGroceryId(Long groceryId) {
		// TODO Auto-generated method stub
		return groceryRepository.findById(groceryId).get();
					
	}

	
	

}
