package in.co.greenwave.brand.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.co.greenwave.brand.entity.BrandDetails;
import in.co.greenwave.brand.repository.BrandRepositoryService;

@Service
public class BrandServiceImpl implements BrandService{

		@Autowired
		BrandRepositoryService brandRepositoryService;
		
		@Override
		public ResponseEntity<List<BrandDetails>> getAllBrands(){
			
			try {
				
				List<BrandDetails> allBrands = brandRepositoryService.getAllBrands();
				
				ResponseEntity<List<BrandDetails>> responseEntity = ResponseEntity.ok(allBrands);
				
				return responseEntity;
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				return ResponseEntity.internalServerError().build();
			}
		}
		
		
		@Override
		public ResponseEntity<BrandDetails> saveBrand(BrandDetails brandDetails) {
			
			try {
				
				BrandDetails saveBrand = brandRepositoryService.saveBrand(brandDetails);
				
				ResponseEntity<BrandDetails> responseEntity = ResponseEntity.ok(saveBrand);
				
				return responseEntity;
				
			} catch (Exception e) {

				e.printStackTrace();
				
				ResponseEntity<BrandDetails> responseEntity = ResponseEntity.internalServerError().build();
				
				return responseEntity;
			}
		}

			
		
		@Override
		public ResponseEntity<Boolean> updateBrand(String brandSapCode,String updatedBy) {
			
			try {
				
				boolean updateBrand = brandRepositoryService.updateBrand(brandSapCode, updatedBy);
				
				ResponseEntity<Boolean> responseEntity = ResponseEntity.ok(updateBrand);
				
				return responseEntity;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return ResponseEntity.internalServerError().build();
			}
		}

}
