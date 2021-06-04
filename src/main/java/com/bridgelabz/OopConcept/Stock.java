package com.bridgelabz.OopConcept;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.model.StockModel;
import com.bridgelabz.utility.OopsUtility;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Stock {

	public static void main(String[] args) throws IOException, JsonMappingException,JsonParseException {
  Scanner sc=new Scanner(System.in);
  String Path="D:\\Java\\JsonPractice\\OopConcept\\src\\main\\java\\com\\bridgelabz\\jsonfiles\\Stock.json";
/** String path store stock jscon file path,
 * using readValue() path of file is read i.e input of file ,from Stock model class,
 */
  ObjectMapper mapper=new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
  StockModel data=mapper.readValue(new File("D:\\Java\\JsonPractice\\OopConcept\\src\\main\\java\\com\\bridgelabz\\jsonfiles\\Stock.json"),StockModel.class);
  System.out.println("-----------------------------Stock Report--------------------------------");
  
  System.out.println("Stock Name: "+data.getPatanjali().get(0).getStock_name()); 
  System.out.println("Number_of_shares"+data.getPatanjali().get(0).getNumber_of_share());
  System.out.println("Stock Price:"+data.getPatanjali().get(0).getShare_price());
  
  int totalValueOfPatanjali=OopsUtility.calculateTotalValueOfStock(data.getPatanjali().get(0).getNumber_of_share(),data.getPatanjali().get(0).getShare_price());
  	data.getPatanjali().get(0).setTotalValueOfStock(totalValueOfPatanjali);    
  	
	System.out.println("Stock Name: " + data.getMarie().get(0).getStock_name());
	System.out.println("Stock Price: " + data.getMarie().get(0).getShare_price());
	System.out.println("Stock Number of Shares: " + data.getMarie().get(0).getNumber_of_shares());
	
	int totalValueOfMarie =OopsUtility.calculateTotalValueOfStock(data.getMarie().get(0).getNumber_of_shares(), data.getMarie().get(0).getShare_price());
	                                                                                                
	System.out.println("Total value of Stock Marie :" + totalValueOfMarie);
	data.getMarie().get(0).setTotalValueOfStock(totalValueOfMarie);

	
	System.out.println("Stock Name: " + data.getOreo().get(0).getStock_name());
	System.out.println("Stock Price: " + data.getOreo().get(0).getShare_price());
	System.out.println("Stock Number of Shares: " + data.getOreo().get(0).getNumber_of_share());
	
	int totalValueOfOreo =OopsUtility.calculateTotalValueOfStock(data.getOreo().get(0).getNumber_of_share(),
			data.getOreo().get(0).getShare_price());
	System.out.println("Total value of Stock Oreo:" + totalValueOfOreo);
	data.getOreo().get(0).setTotalValueOfStock(totalValueOfOreo);

	
	System.out.println("Stock Name: " + data.getTiger().get(0).getStock_name());
	System.out.println("Stock Price: " + data.getTiger().get(0).getShare_price());
	System.out.println("Stock Number of Shares: " + data.getTiger().get(0).getNumber_of_shares());

	int totalValueOfTiger =OopsUtility.calculateTotalValueOfStock(data.getTiger().get(0).getNumber_of_shares(),
			data.getTiger().get(0).getShare_price());
	System.out.println("Total value of Stock Tiger:" + totalValueOfTiger);
	data.getTiger().get(0).setTotalValueOfStock(totalValueOfTiger);

	int totalValueOfAllStock = totalValueOfPatanjali + totalValueOfMarie + totalValueOfOreo + totalValueOfTiger;
	/**@param totalValueOfAllStock to set the calculated total value to the method
	 * 
	 */
	
	data.setTotalValueOfAllStock(totalValueOfAllStock);
	System.out.println("Total count of all stocks :" + totalValueOfAllStock);
	
	

	}


}


