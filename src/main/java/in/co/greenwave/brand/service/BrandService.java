package in.co.greenwave.brand.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import in.co.greenwave.brand.entity.BrandDetails;

public interface BrandService {

	
	ResponseEntity<List<BrandDetails>> getAllBrands();

	ResponseEntity<BrandDetails> saveBrand(BrandDetails brandDetails);

	ResponseEntity<Boolean> updateBrand(String brandSapCode, String updatedBy);

	
}
