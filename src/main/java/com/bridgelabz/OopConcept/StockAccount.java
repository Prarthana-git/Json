package com.bridgelabz.OopConcept;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.model.CompanyShare;
import com.bridgelabz.model.CompanysharesModel;
import com.bridgelabz.model.Customerinfo;
import com.bridgelabz.model.customerinfoModel;
import com.bridgelabz.utility.JsonUtil;
import com.bridgelabz.utility.OopsUtility;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class StockAccount {

	public static void main(String[] args){
	
	boolean isExit = false;
	 int choice=0;
     int indexOfCustomer=0;
     int indexOfCompany=0;
     
     int companySymbol;
     int numOfCompanyShareToBuy;
    
     DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");  
     DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	 
     
     
	CompanysharesModel compModel=new CompanysharesModel();
	customerinfoModel custModel=new customerinfoModel();
	// paths of files
	String pathOfCompanyShare="D:\\Java\\JsonPractice\\OopConcept\\src\\main\\java\\com\\bridgelabz\\jsonfiles\\Compnay_shares.json";
	String pathOfCustomerInfo="D:\\Java\\JsonPractice\\OopConcept\\src\\main\\java\\com\\bridgelabz\\jsonfiles\\customer_Info.json";
	
	// code for fetching json data and put it into models
	
	try {
		// code for fetching the company shares
		compModel=(CompanysharesModel) JsonUtil.readMapper(pathOfCompanyShare,compModel);
		// code for fetching the customer info
	    custModel = (customerinfoModel) JsonUtil.readMapper(pathOfCustomerInfo, custModel);

	} catch (Exception e) {
		
		e.printStackTrace();
	
	}
	    List<Customerinfo> custList=new ArrayList<>();
	    List<CompanyShare> compList=new ArrayList<>();
	    
	   

	    System.out.println("Welcome!!");
		System.out.println("Please enter customer id");
		
		int CustomerId=OopsUtility.integerScanner();
		boolean isCustomerFound=false;
		for(int i=0;i<custList.size();i++)
		{
			if(CustomerId==custList.get(i).getCustomer_symbol())
			{
				isCustomerFound=true;
				indexOfCustomer=i;
				break;
			}
		}
		if(isCustomerFound)
		{
			while(!isExit)
			{  
				System.out.println("Hello:"+custList.get(indexOfCustomer).getCustomer_name());
				System.out.println("Please select options\n" + "1. buy shares\n" + "2. sell shares\n"
						 + "3. exit");
				choice = OopsUtility.integerScanner();
				switch (choice) {
		
		     	case 1: 
					   //buy
		     		   System.out.println("****************buy***************");
					   System.out.println("Please enter company symbol");
					   companySymbol=OopsUtility.integerScanner();
					   System.out.println("Wait....");
					   boolean isCompanyFound=false;
					   for(int i=0;i<compList.size();i++)
					   { isCompanyFound=true;
					     indexOfCompany=i;
					     break; 
		 			   }
					
				   System.out.println("The company you slected is: "+compList.get(indexOfCompany).getCompany_name());
				   System.out.println("Company Share: "+compList.get(indexOfCompany).getCompany_shares());
				   System.out.println("Company Share Price: "+compList.get(indexOfCompany).getCompany_share_price());
				   int customerBalance=custList.get(indexOfCustomer).getCustomer_balance();
				   System.out.println("You have Balance: " + customerBalance);
				   if (isCustomerFound) {
						System.out.println();
						System.out.println("Please enter how much shares to buy: ");
						numOfCompanyShareToBuy = OopsUtility.integerScanner();
						// checking whether amount to buy whether user has that much amount or not
						if(numOfCompanyShareToBuy<compList.get(indexOfCompany).getCompany_shares())
						{  // checking user has that much amount or not
							if(customerBalance>(numOfCompanyShareToBuy*compList.get(indexOfCompany).getCompany_share_price())) 
							{
								int newCustomerBalance=customerBalance-numOfCompanyShareToBuy*compList.get(indexOfCompany).getCompany_share_price();
								// deducting customer balance
								custList.get(indexOfCustomer).setCustomer_balance(newCustomerBalance);
								// adding customer sharescustList.get(indexOfCustomer).setCustomer_shares(
								custList.get(indexOfCustomer).setCustomer_shares(
								custList.get(indexOfCustomer).getCustomer_shares() + numOfCompanyShareToBuy);
						// deducting the company share
						compList.get(indexOfCompany).setCompany_shares(
								compList.get(indexOfCompany).getCompany_shares() - numOfCompanyShareToBuy);
						// calculating new total value of company
						compList.get(indexOfCompany)
								.setCompany_shares(compList.get(indexOfCompany).getCompany_share_price()
										* compList.get(indexOfCompany).getCompany_shares());
						 LocalDateTime currentDateTime = LocalDateTime.now(); 
						 String formatDateTime = currentDateTime.format(format1);   
						    System.out.println(formatDateTime); 
					  		}
						}
				   }		
				   case 2:
								// sell
								System.out.println("****************sell***************");

								System.out.println("Enter number of share you want to sell");

								int share = OopsUtility.integerScanner();

								System.out.println("Please enter company symbol to who you want to sell: ");
								companySymbol = OopsUtility.integerScanner();

								System.out.println("Validating...");
								boolean isCompanyFound2 = false;
								for (int i = 0; i < compList.size(); i++) {
									if (companySymbol == compList.get(i).getCompany_symbol()) {
										isCompanyFound2 = true;
										indexOfCompany = i;
										break;
									}
								}

								// if company is valid
								if (isCompanyFound2) {
									System.out.println(
											"The company you selected is: " + compList.get(indexOfCompany).getCompany_name());
									System.out.println("Company shares: " + compList.get(indexOfCompany).getCompany_shares());
									System.out.println(
											"Company share price: " + compList.get(indexOfCompany).getCompany_share_price());
									int amountToGet = share * compList.get(indexOfCompany).getCompany_share_price();
									System.out.println("Amount you will get: " + amountToGet);
									// company share increase
									if (share <= custList.get(indexOfCustomer).getCustomer_shares()) {
										compList.get(indexOfCompany)
												.setCompany_shares(compList.get(indexOfCompany).getCompany_shares() + share);
										// company value increase
										compList.get(indexOfCompany)
												.setCompany_total_values(compList.get(indexOfCompany).getCompany_share_price()
														* compList.get(indexOfCompany).getCompany_shares());

										// customer share decrease
										custList.get(indexOfCustomer)
												.setCustomer_shares(custList.get(indexOfCustomer).getCustomer_shares() + share);

										// customer balance increase

										custList.get(indexOfCustomer).setCustomer_balance(
												custList.get(indexOfCustomer).getCustomer_balance() + amountToGet);	
										
										LocalDateTime currentDateTime = LocalDateTime.now(); 
										 String formatDateTime = currentDateTime.format(format1);   
										    System.out.println(formatDateTime);
									}
								}
									case 3:
										  isExit = true;
										  System.out.println("Thank you for using service");
									   	  break;
									default:
										  System.out.println("Please select valid option");
										  
							}
						}// end of switch loop
					} // end of while loop
		
				else {
					System.out.println("Invalid customer id");
				}
		
			}					
	}	



