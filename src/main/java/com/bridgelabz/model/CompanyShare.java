package com.bridgelabz.model;

import java.util.Date;

public class CompanyShare {

	private int company_symbol;
	private String company_name;
	private int company_shares;
    private int company_share_price;
    private int company_total_values;

	public int getCompany_symbol()
	{
		return company_symbol;
	}
	public void setCompany_symbol(int company_symbol) {
		this.company_symbol = company_symbol;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getCompany_shares() {
		return company_shares;
	}
	public void setCompany_shares(int company_shares) {
		this.company_shares = company_shares;
	}
	public int getCompany_share_price() {
		return company_share_price;
	}
	public void setCompany_share_price(int company_share_price) {
		this.company_share_price = company_share_price;
	}
	public int getCompany_total_values() {
		return company_total_values;
	}
	public void setCompany_total_values(int company_total_values) {
		this.company_total_values = company_total_values;
	}
		      
}


