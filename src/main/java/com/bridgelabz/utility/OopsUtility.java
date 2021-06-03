package com.bridgelabz.utility;

/** Purpose: This is utility file which contains logic for files.
*  		 this file is having methods who can take input process it and 
*  		 returns the output.
*/
import java.util.Scanner;
public class OopsUtility {

	

	/**
	 * Purpose: method for calculate total value of stock
	 * 
	 * @param numberOfShares input from program
	 * @param sharePrice     input from program
	 * @return returns the multiplication of numberOfShares sharePrice
	 */
	public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
		return numberOfShares * sharePrice;
	}

}
