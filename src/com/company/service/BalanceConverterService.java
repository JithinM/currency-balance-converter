package com.company.service;

import com.company.currency.Currency;
import com.company.currency.CurrencyBalance;

/**
 * Service to convert a balance amount to least number of denominations
 * 
 * @author Jithin
 *
 */
public interface BalanceConverterService {

	/**
	 * Converts the balance into the least number of bills/coins. The balance is
	 * expressed as the lowest unit of currency (e.g. pennies for USD). Examples
	 * (USD): Given the balance 87, the function will return 3 Quarter, 1 Dime, 2
	 * Penny coins. Given the balance 287, the function will return 2 Dollar, 3
	 * Quarter, 1 Dime, 2 Penny coins.
	 * 
	 * @param amount expressed as the lowest unit of currency
	 * @param currency 
	 */
	CurrencyBalance getCurrencyBalance(Currency currency,int amount);
}
