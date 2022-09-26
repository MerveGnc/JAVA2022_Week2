package oop1;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxName() {
		return taxNumber;
	}
	public void setTaxName(String taxName) {
		this.taxNumber = taxName;
	}
	
	
}
