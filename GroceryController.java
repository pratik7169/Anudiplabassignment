package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Grocery;
import com.example.Service.GroceryService;
@RestController

public class GroceryController {
	@Autowired (required=true)
   private GroceryService groceryService;
	//creating post mapping that post the Grocery detail in the database  
	@PostMapping("/Grocery")
	Grocery createGrocery(@RequestBody Grocery grocery)
	{
		
		return groceryService.createGrocery(grocery);
	}
	//creating a get mapping that retrieves all the Grocery detail from the database   
   @GetMapping("/Grocery")  
private List<Grocery> findAllGrocery()   
{  
return groceryService.findAllGrocery();  
} 
 //creating a get mapping that retrieves the detail of a specific Grocery
   @GetMapping("/Grocery/{groceryid}")  
   private Grocery getBooks(@PathVariable("Groceryid") Long id)   
   {  
   return groceryService.findByGroceryId(id);
   }  
 //creating a delete mapping that deletes a specified Grocery  
   @DeleteMapping("/Grocery/{Groceryid}")  
   private void deleteGrocery(@PathVariable("Groceryid") Long id)   
   {  
	   groceryService.deleteGrocery(id);
   }  
 //creating post mapping that post the Grocery detail in the database  
  
}