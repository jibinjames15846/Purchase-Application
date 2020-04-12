package com.example.jibinrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jibinrest.model.Product;
import com.example.jibinrest.model.Purchase;
import com.example.jibinrest.service.PurchaseService;

@RestController
public class PurchaseController {
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("/purchase")
	public void add(@RequestBody Purchase purchase) {
		
		System.out.print("Inside add purchase");
		System.out.print(purchase.getProdctId());
		Integer userId = purchase.getUserId();
		System.out.print("user id is :" +userId);
		System.out.print("-------------------------//////////////////////----------");
		Integer productId = purchase.getProdctId();
		Integer quantity  = purchase.getQuantity();
		purchaseService.purchase(userId, productId, quantity);
		System.out.print("Inside add purchase jibin test here ");
	}

	
	
	
							// working code  start 
	
	
	//@PostMapping("/purchase")
//	public void add(@RequestBody Purchase purchase) {
		
//		purchaseService.purchase(purchase);
//		System.out.print("Inside add purchase");
//		System.out.print(purchase.getProdctId());
//		Integer userId = purchase.getUserId();
//		System.out.print("user id is :" +userId);
//		System.out.print("-------------------------//////////////////////----------");
//		Integer productId = purchase.getProdctId();
//		Integer quantity  = purchase.getQuantity();
//		purchaseService.purchase(userId, productId, quantity);
//		System.out.print("Inside add purchase jibin test here ");
//	}
	                    // working code stop 
	
	
	
}
