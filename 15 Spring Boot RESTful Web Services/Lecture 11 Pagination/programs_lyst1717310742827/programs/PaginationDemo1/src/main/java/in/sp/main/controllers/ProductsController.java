package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.models.Products;
import in.sp.main.service.ProductsService;

@Controller
public class ProductsController 
{
	@Autowired
	private ProductsService productsService;
	
	@GetMapping("/products")
	public String getProductsList(@RequestParam(defaultValue = "1") int pageNo, Model model) throws Exception
	{
		int pageSize = 8;
		int pageIndex = pageNo-1;
		
		Pageable pageable = PageRequest.of(pageIndex, pageSize);
		
		Page<Products> productsPage = productsService.getProductsService(pageable);
		
		model.addAttribute("modelProductsList", productsPage.getContent());
		model.addAttribute("modelCurrentPage", pageNo);
		model.addAttribute("modelTotalPages", productsPage.getTotalPages());
		
		return "view-all-products";
	}
}