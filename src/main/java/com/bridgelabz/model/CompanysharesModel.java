package com.bridgelabz.model;

import java.util.List;

public class CompanysharesModel {

	private List<CompanyShare> companyshares;
	public List<CompanyShare> getCompanyshare(){
		return companyshares;
	}
	
	public void setCompanyshare(List<CompanyShare> companyshares)
	{
		this.companyshares=companyshares;
	}
}
