package com.company.currency;

import com.company.currency.Denomination;

/**
 * Currency balance contains list of Denominations.
 * It keep track of count of distinct Denomination
 * @author Jithin
 *
 */
public interface CurrencyBalance {
	
	/**
	 * add Denomination
	 * @param denom
	 */
	public void addDenomination(Denomination denom);
	
	
	/**
	 * Get description of balanace
	 * @return Description 
	 */
	public String getDecription();
	
	/**
	 * @return
	 */
	public int getValue() ;
	
 	
}
