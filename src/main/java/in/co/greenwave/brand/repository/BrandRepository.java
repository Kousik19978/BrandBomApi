package in.co.greenwave.brand.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import in.co.greenwave.brand.entity.BrandCompositeKey;
import in.co.greenwave.brand.entity.BrandDetails;


public interface BrandRepository extends JpaRepository<BrandDetails, BrandCompositeKey>{

			
}
