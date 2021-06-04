package com.bridgelabz.utility;

/** Purpose: This is utility file which contains logic for files.
*  		 this file is having methods who can take input process it and 
*  		 returns the output.
*/
import java.util.Scanner;
public class OopsUtility {

	
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Purpose: for scanning integer from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns int which is taken from console
	 */
	public static int integerScanner() {
		return scanner.nextInt();
	}

	/**
	 * Purpose: for scanning String from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns string which is taken from console
	 */
	public static String stringScanner() {
		return scanner.next();
	}
	
	public static long longScanner() {
		return scanner.nextLong();
	}

	/**
	 * Purpose: for scanning String single word from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns string which is taken from console
	 */
	public static String stringSingleWordScanner() {
		return scanner.next();
	}

	/**
	 * Purpose: for scanning Char from user
	 * 
	 * Identifier: json
	 * 
	 * @return returns char which is taken from console
	 */
	public static char charScanner() {
		return scanner.next().charAt(0);
	}

	


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
