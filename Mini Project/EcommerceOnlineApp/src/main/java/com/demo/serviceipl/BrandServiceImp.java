package com.demo.serviceipl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.demo.pojo.Brand;
import com.demo.pojo.Product;
import com.demo.repositary.Brandrepositary;
import com.demo.service.BrandService;

@Component
public class BrandServiceImp implements BrandService {

	@Autowired
	Brandrepositary brandRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Brand addBrandDetails(Brand brand) {
		return brandRespositary.save(brand);
	}

	public Optional<Brand> getDetailsById(long id) {
		Optional<Brand> detailsOfbrand = brandRespositary.findById(id);
		return detailsOfbrand;
	}

	public Brand saveBranddetailstoProduct(Brand brand) {
		List<Product> product = brand.getProductList();
        brand.setProductList(product);
        Product p = new Product(); 
        p.setBrands(brand);
        brand = brandRespositary.save(brand);
        return brand;
         
	}
}