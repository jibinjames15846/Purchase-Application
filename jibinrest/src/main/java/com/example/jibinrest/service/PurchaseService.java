package com.example.jibinrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jibinrest.model.Product;
import com.example.jibinrest.model.Purchase;
import com.example.jibinrest.model.User;
import com.example.jibinrest.repository.PurchaseRepository;

@Service
public class PurchaseService {
	@Autowired
	private PurchaseRepository purchaseRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	
	

	public void purchase(Integer userId, Integer productId, Integer quantity) {
	
	Purchase purchaseData = new Purchase();
	
		
	if(userId == null || productId == null || quantity == null)
		{
			System.out.println("Please give valid userID , prodcutID and Quantity ");
		}
		
		if(userId!=null)
		{
			User user = userService.get(userId);
			if(user==null)
				System.out.println("No user exits with ID"+userId);
			
		}
		
		if(productId!=null)
		{
			Product product = productService.get(productId);
			if(product==null)
				System.out.println("No Product exist with ID "+productId);
		
		}
		
		if(userId !=null && productId!=null && quantity!=null)
		{
			
			purchaseData.setProdctId(productId);
			purchaseData.setUserId(userId);
			purchaseData.setQuantity(quantity);
			purchaseRepository.save(purchaseData);
			productService.delete(purchaseData.getProdctId());
			System.out.print("purchase data is " +purchaseData);
		}
		
		

	}
	
//	
//	public void  purchase(Purchase purchase)
//	{
//		purchaseRepository.save(purchase);
//		productService.delete(purchase.getProdctId());
//		
//		
//		
//	}
	
	

}
