package in.co.greenwave.brand.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "[dbo].[BrandMaster]")
@IdClass(BrandCompositeKey.class)
public class BrandDetails {
	
	@Id
	@Column(name = "EntryTime")
	private String entryTime;
	
	@Column(name = "UserId")
	private String userId;
	
	@Column(name = "BrandName")
	private String brandName;
	
	@Id
	@Column(name = "BrandSapCode")
	private String brandSapCode;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "ProductionType")
	private String productionType;
	
	@Column(name = "ProductType")
	private String productType;
	
	@Column(name = "Segment")
	private String segment;
	
	@Column(name = "Length")
	private String length;
	
	@Column(name = "Circumference")
	private String circumference;
	
	@Column(name = "PressureDrop")
	private String pressureDrop;
	
	@Column(name = "Weight")
	private String weight;
	
	@Column(name = "CircumferenceLCL")
	private String circumferenceLCL;
	
	@Column(name = "CircumferenceUCL")
	private String circumferenceUCL;
	
	@Column(name = "PressureDropLCL")
	private String pressureDropLCL;
	
	@Column(name = "PressureDropUCL")
	private String pressureDropUCL;
	
	@Column(name = "Hardness")
	private String hardness;
	
	@Column(name = "HardnessLCL")
	private String hardnessLCL;
	
	@Column(name = "HardnessUCL")
	private String hardnessUCL;
	
	@Column(name = "CircumferenceSD")
	private String circumferenceSD;
	
	@Column(name = "PressureDropSD")
	private String pressureDropSD;
	
	@Id
	@Column(name = "Active")
	private boolean active;
	
	@Column(name = "UpdatedBy")
	private String updatedBy;
	
	@Column(name = "UpdateTime")
	private String updateTime;
	
	
	public BrandDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BrandDetails(String entryTime, String userId, String brandName, String brandSapCode, String description,
			String productionType, String productType, String segment, String length, String circumference,
			String pressureDrop, String weight, String circumferenceLCL, String circumferenceUCL,
			String pressureDropLCL, String pressureDropUCL, String hardness, String hardnessLCL, String hardnessUCL,
			String circumferenceSD, String pressureDropSD, boolean active, String updatedBy, String updateTime) {
		super();
		this.entryTime = entryTime;
		this.userId = userId;
		this.brandName = brandName;
		this.brandSapCode = brandSapCode;
		this.description = description;
		this.productionType = productionType;
		this.productType = productType;
		this.segment = segment;
		this.length = length;
		this.circumference = circumference;
		this.pressureDrop = pressureDrop;
		this.weight = weight;
		this.circumferenceLCL = circumferenceLCL;
		this.circumferenceUCL = circumferenceUCL;
		this.pressureDropLCL = pressureDropLCL;
		this.pressureDropUCL = pressureDropUCL;
		this.hardness = hardness;
		this.hardnessLCL = hardnessLCL;
		this.hardnessUCL = hardnessUCL;
		this.circumferenceSD = circumferenceSD;
		this.pressureDropSD = pressureDropSD;
		this.active = active;
		this.updatedBy = updatedBy;
		this.updateTime = updateTime;
	}


	public String getEntryTime() {
		return entryTime;
	}


	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getBrandSapCode() {
		return brandSapCode;
	}


	public void setBrandSapCode(String brandSapCode) {
		this.brandSapCode = brandSapCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProductionType() {
		return productionType;
	}


	public void setProductionType(String productionType) {
		this.productionType = productionType;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getSegment() {
		return segment;
	}


	public void setSegment(String segment) {
		this.segment = segment;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	public String getCircumference() {
		return circumference;
	}


	public void setCircumference(String circumference) {
		this.circumference = circumference;
	}


	public String getPressureDrop() {
		return pressureDrop;
	}


	public void setPressureDrop(String pressureDrop) {
		this.pressureDrop = pressureDrop;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getCircumferenceLCL() {
		return circumferenceLCL;
	}


	public void setCircumferenceLCL(String circumferenceLCL) {
		this.circumferenceLCL = circumferenceLCL;
	}


	public String getCircumferenceUCL() {
		return circumferenceUCL;
	}


	public void setCircumferenceUCL(String circumferenceUCL) {
		this.circumferenceUCL = circumferenceUCL;
	}


	public String getPressureDropLCL() {
		return pressureDropLCL;
	}


	public void setPressureDropLCL(String pressureDropLCL) {
		this.pressureDropLCL = pressureDropLCL;
	}


	public String getPressureDropUCL() {
		return pressureDropUCL;
	}


	public void setPressureDropUCL(String pressureDropUCL) {
		this.pressureDropUCL = pressureDropUCL;
	}


	public String getHardness() {
		return hardness;
	}


	public void setHardness(String hardness) {
		this.hardness = hardness;
	}


	public String getHardnessLCL() {
		return hardnessLCL;
	}


	public void setHardnessLCL(String hardnessLCL) {
		this.hardnessLCL = hardnessLCL;
	}


	public String getHardnessUCL() {
		return hardnessUCL;
	}


	public void setHardnessUCL(String hardnessUCL) {
		this.hardnessUCL = hardnessUCL;
	}


	public String getCircumferenceSD() {
		return circumferenceSD;
	}


	public void setCircumferenceSD(String circumferenceSD) {
		this.circumferenceSD = circumferenceSD;
	}


	public String getPressureDropSD() {
		return pressureDropSD;
	}


	public void setPressureDropSD(String pressureDropSD) {
		this.pressureDropSD = pressureDropSD;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}


	@Override
	public String toString() {
		return "BrandDetails [entryTime=" + entryTime + ", userId=" + userId + ", brandName=" + brandName
				+ ", brandSapCode=" + brandSapCode + ", description=" + description + ", productionType="
				+ productionType + ", productType=" + productType + ", segment=" + segment + ", length=" + length
				+ ", circumference=" + circumference + ", pressureDrop=" + pressureDrop + ", weight=" + weight
				+ ", circumferenceLCL=" + circumferenceLCL + ", circumferenceUCL=" + circumferenceUCL
				+ ", pressureDropLCL=" + pressureDropLCL + ", pressureDropUCL=" + pressureDropUCL + ", hardness="
				+ hardness + ", hardnessLCL=" + hardnessLCL + ", hardnessUCL=" + hardnessUCL + ", circumferenceSD="
				+ circumferenceSD + ", pressureDropSD=" + pressureDropSD + ", active=" + active + ", updatedBy="
				+ updatedBy + ", updateTime=" + updateTime + "]";
	}



}
