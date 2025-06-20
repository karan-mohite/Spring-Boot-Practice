package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sp.main.models.Products;
import in.sp.main.service.ProductsService;

@Controller
public class ProductsController 
{
	@Autowired
	private ProductsService productsService;
	
	@GetMapping("/products")
	public String getProductsList(Model model) throws Exception
	{
		List<Products> productsList = productsService.getProductsService();
		model.addAttribute("model_productsList", productsList);
		
		return "view-all-products";
	}
}