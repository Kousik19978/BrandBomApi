package in.co.greenwave.brand.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.brand.entity.BrandDetails;
import in.co.greenwave.brand.repository.BrandRepositoryService;
import in.co.greenwave.brand.service.BrandService;

@RestController
@RequestMapping("/brand")
//@CrossOrigin("*")
public class BrandController {

	@Autowired
	BrandService brandService;
	
	@GetMapping("/test")
	public String test() {
		
		
		return "<h1>success</h1>";
	}
	
	@GetMapping("/brands")
	public ResponseEntity<List<BrandDetails>> getAllBrands(){
		
		ResponseEntity<List<BrandDetails>> allBrands = brandService.getAllBrands();
		
		return allBrands;
	}
	
	
	@PostMapping("/saveBrand")
	public ResponseEntity<BrandDetails> saveBrand(@RequestBody BrandDetails brandDetails) {
		
		System.out.println(brandDetails);
		
		ResponseEntity<BrandDetails> saveBrand = brandService.saveBrand(brandDetails);
		
		return saveBrand;
		
	}

	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateBrand(@RequestParam String brandSapCode,@RequestParam String updatedBy) {
		
			ResponseEntity<Boolean> updateBrand = brandService.updateBrand(brandSapCode, updatedBy);
			
			return updateBrand;
	}

	
}
