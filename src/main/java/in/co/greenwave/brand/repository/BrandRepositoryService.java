package in.co.greenwave.brand.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.co.greenwave.brand.entity.BrandDetails;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BrandRepositoryService {

		@Autowired
		BrandRepository brandRepository;
		
		@Autowired
		@Qualifier("SqlServer")
		JdbcTemplate jdbcTemplate;
		
		/*
		 *  gets all brands
		 */
		public List<BrandDetails> getAllBrands(){
			
			String query = "SELECT distinct bm.[BrandSapCode],ca.[EntryTime],ca.[UserId],ca.[BrandName],ca.[Description],ca.[ProductionType],ca.[ProductType],ca.[Segment],ca.[Length], ca.[Circumference],ca.[PressureDrop],ca.[Weight],ca.[CircumferenceLCL],ca.[CircumferenceUCL],ca.[PressureDropLCL],ca.[PressureDropUCL],ca.[Hardness],ca.[HardnessLCL], ca.[HardnessUCL],ca.[CircumferenceSD],ca.[PressureDropSD] FROM [dbo].[BrandMaster] bm CROSS APPLY(SELECT top 1 [EntryTime] ,[UserId] ,[BrandName] ,[BrandSapCode] ,[Description] ,[ProductionType] ,[ProductType] ,[Segment] ,[Length] ,[Circumference] ,[PressureDrop] ,[Weight] ,[CircumferenceLCL] ,[CircumferenceUCL] ,[PressureDropLCL] ,[PressureDropUCL] ,[Hardness] ,[HardnessLCL] ,[HardnessUCL] ,[CircumferenceSD] ,[PressureDropSD] FROM [dbo].[BrandMaster] b WHERE b.[BrandSapCode] = bm.[BrandSapCode] order by [EntryTime] desc ) ca";
			
			  List<BrandDetails> allBrands = jdbcTemplate.query(query,new BeanPropertyRowMapper<>(BrandDetails.class));
			
			return allBrands;
		}
		
		
		
		
		public BrandDetails saveBrand(BrandDetails brandDetails) {
			
			BrandDetails savedBrand = brandRepository.save(brandDetails);
			
			return savedBrand;
		}
	
		
		public boolean updateBrand(String brandSapCode,String updatedBy) {
			
			String updateQuery1 = "UPDATE [dbo].[BrandMaster] SET [UpdatedBy] = ?, [UpdateTime]=GETDATE() WHERE [BrandSapCode]=? and [Active]=1;";
			
			int update = jdbcTemplate.update(updateQuery1,updatedBy,brandSapCode);
			
			String updateQuery2 = "UPDATE [dbo].[BrandMaster] SET [Active] = [Active]-1 WHERE [BrandSapCode]=?;";
			
			int update2 = jdbcTemplate.update(updateQuery2,brandSapCode);
			
			return update > 0;
			
		}
}
